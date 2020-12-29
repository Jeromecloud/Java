import java.sql.Connection;
import java.sql.SQLException;
public class JDBCTest {
    public static void main(String[] args) throws SQLException {
        String sql = "insert into city values(2,'上海',0)";
        JDBC.Update(sql);
        JDBC.closeAll();
    }
}
