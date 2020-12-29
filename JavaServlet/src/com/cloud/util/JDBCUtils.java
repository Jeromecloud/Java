package com.cloud.util;

import java.io.InputStream;
import java.sql.*;
import java.util.*;

/*JDBC开发步骤
1、注册驱动；
2、获得连接；
3、获得 SQL 语句执行平台，并执行 SQL 语句；
4、处理结果；
5、释放资源；
*/
public class JDBCUtils {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/zf_system?useSSL=false";
    private static String user = "root";
    private static String password = "tianqing1";

    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

//    static {
//        try{
//            Properties properties = new Properties();//创建 Properties 对象用来加载配置文件的内容
//            InputStream inputStream = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");//要加载的配置文件
//            properties.load(inputStream);//把配置文件中的内容加载到 Properties 对象中
//            properties.load(new FileReader("db.properties"));
//            driver = properties.getProperty("jdbc.driver");
//            url = properties.getProperty("jdbc.url");
//            user = properties.getProperty("jdbc.user");
//            password = properties.getProperty("jdbc.password");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }


    /*封装连接*/
    public static Connection getConnection() {
        try {
//            System.out.println(driver+" "+url+" "+user+" "+password);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("JDBC:数据库连接失败");
            e.printStackTrace();
        }
        return connection;
    }

    /*JDBC DML操作*/
    public static ResultSet executeQuery(String sql, String... param) throws SQLException {
        getConnection();
        preparedStatement = connection.prepareStatement(sql);
        if (param != null) {
            for (int i = 0; i < param.length; i++) {
                preparedStatement.setString(i + 1, param[i]);
            }
            resultSet = preparedStatement.executeQuery();
            System.out.println("JDBC:查询语句执行完毕，申请关闭数据库资源");
        }else{
            System.out.println("JDBC:数据不对，莫瞎搞");
        }
        return resultSet;
    }

//   插入
    public static boolean insert(String sql) {
        System.out.println("JDBC:JDBC开始执行；");
        boolean flag = false;
        try {
            getConnection();
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate(sql);
            if (result > 0) {
                System.out.println("JDBC:数据插入成功");
                flag = true;
            } else {
                System.out.println("JDBC:无数据");
            }
        } catch (Exception e) {
            System.out.println("JDBC:数据插入失败");
            e.printStackTrace();
        } finally {
            closeAll();
            return flag;
        }
    }

    /**
     * close所有的jdbc操作
     */
    public static void closeAll() {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
    }
}