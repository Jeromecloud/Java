package com.cloud.dao;

import com.cloud.util.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImplement implements UserDao {

    @Override
    public boolean login(String user, String password) throws SQLException {
        boolean flag = false;
        String sql = "select user,password from user where user= ? and password= ? ";
        System.out.println("DAO:生成sql语句：" + sql);
        System.out.println("DAO:准备执行sql语句,开始调用JDBC");
        ResultSet rs = JDBCUtils.executeQuery(sql,user,password);
        try {
            while (rs.next()) {
                if (rs.getString("user").equals(user) && rs.getString("password").equals(password)) {
                    System.out.println("DAO:验证成功");
                    flag = true;
                } else {
                    System.out.println("DAO:账号密码输入错误");
                    flag = false;
                }
            }
            System.out.println("DAO:JDBC调用完毕");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeAll();
            System.out.println("DAO:数据库关闭，JDBC关闭");
        }
        return flag;

    }

    @Override
    public boolean register(String user, String password) throws SQLException {
        String sql = "insert into user(user,password) values(?,?)";
        System.out.println("DAO:生成sql语句：" + sql + "\n准备执行sql语句,开始调用JDBC");
        return JDBCUtils.insert(sql);
    }
}
