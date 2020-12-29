import java.io.*;
import java.sql.*;
import java.util.*;

/*JDBC开发步骤
1、注册驱动；
2、获得连接；
3、获得 SQL 语句执行平台，并执行 SQL 语句；
4、处理结果；
5、释放资源；
*/
public class JDBC {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    static {
        try{
            Properties properties = new Properties();//创建 Properties 对象用来加载配置文件的内容
            InputStream inputStream = JDBC.class.getClassLoader().getResourceAsStream("db.properties");//要加载的配置文件
            properties.load(inputStream);//把配置文件中的内容加载到 Properties 对象中
            driver = properties.getProperty("jdbc.driver");
            url = properties.getProperty("jdbc.url");
            user = properties.getProperty("jdbc.user");
            password = properties.getProperty("jdbc.password");
//            url = "jdbc:mysql://localhost:3306/zf_system";
//            user = "root";
//            password = "tianqing1";
            System.out.println(driver);
            System.out.println(url);
            System.out.println(user);
            System.out.println(password);
        } catch (Exception e) {
            System.out.println("加载properties失败");
            e.printStackTrace();
        }
    }

    /*封装连接*/
    public static Connection getConnection(){
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    /*JDBC DML操作*/
    public static boolean Update(String sql,Object... params) throws SQLException {
        connection = getConnection();
        preparedStatement = connection.prepareStatement(sql);
        try{
            // 对 parameters 进行赋值：
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i+1,params[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 封装jdbc查询方法
     *
     */
    public static List<Map<String, Object>> executeQuery(String sql, Object... params) throws SQLException {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        int index = 1;
        connection = getConnection();
        preparedStatement = connection.prepareStatement(sql);
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(index++, params[i]);
            }
        }
        resultSet = preparedStatement.executeQuery();
        ResultSetMetaData setMetaData = resultSet.getMetaData();
        // 获取列的数量
        int col_len = setMetaData.getColumnCount();
        while (resultSet.next()) {
            Map<String, Object> map = new HashMap<String, Object>();
            for (int i = 0; i < col_len; i++) {
                String col_name = setMetaData.getColumnName(i + 1);
                Object col_value = resultSet.getObject(col_name);
                if (col_value == null) {
                    col_value = "";
                }
                map.put(col_name, col_value);
            }
            list.add(map);
        }
        closeAll();
        return list;
    }

    /**
     * close所有的jdbc操作
     */
    public static void closeAll() {
        try {
            if(resultSet!=null)resultSet.close();
            if(preparedStatement!=null)preparedStatement.close();
            if(connection!=null)connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    public static void close(AutoCloseable obj){
//        /*关闭资源
//        因为Connection和Statement/PreparedStatement以及ResultSet都实现了AutoCloseable接口
//        所以直接写AutoCloseable
//        */
//        if(obj != null){
//            try{
//                obj.close();
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//
//        }
//    }
        public static void main(String[] args) throws SQLException {
    }
}
/*查询
* String sql="select * from user where username = ? and password = ?";
	Object[] params = new Object[] {username, password};
	List<Map<String, Object>> list = null;

	try {
		list = DBCompleteUtil.executeQuery(sql, params);
	} catch (SQLException e) {
		e.printStackTrace();
	}
* */
/*增删改
* String sql="insert into user values(?, ?, ?)";
	Object[] params = new Object[] {UUID.randomUUID().toString(), username, password};
	boolean flag = false;

	try {
		flag = DBCompleteUtil.executeUpdate(sql, params);
	} catch (SQLException e) {
		e.printStackTrace();
	}
* */