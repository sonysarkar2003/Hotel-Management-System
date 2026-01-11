
package hotel.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hotelmanagementsystem?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "Sony@2003"
            );

            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
