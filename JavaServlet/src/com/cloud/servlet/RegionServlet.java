package com.cloud.servlet;

import com.cloud.bean.Region;
import com.cloud.dao.RegionDao;
import com.cloud.dao.RegionDaoImplement;
import com.cloud.util.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/Region/*")
public class RegionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = request.getRequestURI();
//        System.out.println("Servlet:url="+url);//"/RegionServlet"
        String requestUrl = url.substring(url.lastIndexOf("/") + 1);//截方法名，不加1会截取"/query"
        System.out.println("Servlet:请求方法为:" + requestUrl);
        try {
            Method method = getClass().getDeclaredMethod(requestUrl, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this, request, response);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private void query(HttpServletRequest request, HttpServletResponse response) {
        RegionDaoImplement re = new RegionDaoImplement();
        try {
            ResultSet rs = re.query();
            System.out.println("Servlet:已获得数据");
            ArrayList<Region> list = new ArrayList<Region>();
            while (rs.next()) {
                Region a = new Region();
                a.setName(rs.getString("name"));
                System.out.println("Servlet:" + a.getName());
                list.add(a);
            }
            request.setAttribute("list", list);
            System.out.println("Servlet:数据已存储完毕，即将转发数据到响应页面");
            request.getRequestDispatcher("/jsp/region.jsp").forward(request, response);
        } catch (SQLException | ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegionDao reDao = new RegionDaoImplement();
        String name = request.getParameter("name");
        System.out.println("RegionServlet:添加城市名:" + name);
        if (reDao.add(name)){
            System.out.println("RegionServlet:添加成功");
            request.getRequestDispatcher("/jsp/index.jsp").forward(request,response);
        }else{
            System.out.println("RegionServlet:添加失败");
            response.sendRedirect("/jsp/404.jsp");
        }

    }
}
