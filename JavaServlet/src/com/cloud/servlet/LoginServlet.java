package com.cloud.servlet;

import com.cloud.dao.UserDao;
import com.cloud.dao.UserDaoImplement;
import com.cloud.util.JDBCUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("LoginServlet:LoginServlet启动");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");//调用 request.getParameter() 方法来获取表单参数的值。
//        getParameterValues()：如果参数出现一次以上，则调用该方法，并返回多个值，例如复选框。
//        getParameterNames()：如果您想要得到当前请求中的所有参数的完整列表，则调用该方法。枚举类型
//        复选框选中后，getParameter得到的值是on
        request.getSession().setAttribute("user",user);//将用户名保存在整个会话期间
        String password = request.getParameter("password");
        System.out.println("LoginServlet:得到请求信息：" + user + " " + password);
        UserDaoImplement userDao = new UserDaoImplement();
        System.out.println("LoginServlet:开始处理数据");
        try {
            System.out.println("LoginServlet:传入数据，进行登录验证");
            if (userDao.login(user, password)) {
                request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);//转发到成功页面
            } else {
                System.out.println("LoginServlet:账号密码错误，转到test页面");
                response.sendRedirect("/test.html"); //重定向到首页
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            System.out.println("LoginServlet:请求处理完毕");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
