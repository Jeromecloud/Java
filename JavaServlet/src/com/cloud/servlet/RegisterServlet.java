package com.cloud.servlet;

import com.cloud.dao.UserDao;
import com.cloud.dao.UserDaoImplement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        System.out.println("得到请求数据:" + user + " " + password + "开始处理数据");
        UserDao registerDao = new UserDaoImplement();
        try {
            if (registerDao.register(user, password)) {
                request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
            } else {
                response.sendRedirect("/jsp/404.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
