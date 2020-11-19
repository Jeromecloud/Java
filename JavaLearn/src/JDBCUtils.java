import java.rmi.Remote;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.DriverManager.getConnection;
import java.sql.Connection;

public class JDBCUtils implements Remote {
	private static String driver;
	private static String dbUrl;
	private static String dbUser;
	private static String dbPassWord;

	public static String getDriver() {
		return driver;
	}

	public static void setDriver(String driver) {
		JDBCUtils.driver = driver;
	}

	public static String getDbUrl() {
		return dbUrl;
	}

	public static void setDbUrl(String dbUrl) {
		JDBCUtils.dbUrl = dbUrl;
	}

	public static String getDbUser() {
		return dbUser;
	}

	public static void setDbUser(String dbUser) {
		JDBCUtils.dbUser = dbUser;
	}

	public static String getDbPassWord() {
		return dbPassWord;
	}

	public static void setDbPassWord(String dbPassWord) {
		JDBCUtils.dbPassWord = dbPassWord;
	}

	Connection getConn() throws SQLException {
		java.sql.Connection connection = null;
		try {
			connection = (Connection) getConnection(dbUrl, dbUser, dbPassWord);
		} catch (SQLException e) {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			connection = getConnection(dbUrl, dbUser, dbPassWord);
		}
		return connection;
	}

	void closeStatementAndConnection(Statement ps, Connection conn) {
		try {
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void closeConn(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}