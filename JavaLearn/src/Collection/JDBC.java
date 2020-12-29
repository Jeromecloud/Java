package Collection;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载MySql驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获得数据库链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1", "root", "tianqing1");
        Statement stmt = conn.createStatement();
        String sql = "select * from book3";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            int id = rs.getInt("id");
            System.out.println(id);
        }
    }
}
