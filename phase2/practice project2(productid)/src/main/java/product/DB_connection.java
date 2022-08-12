package product;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB_connection {
	  static Connection con = null;
	    public static Connection getConnection() {
	        try {
	             Class.forName("com.mysql.cj.jdbc.Driver");
	            String url = "jdbc:mysql://localhost:3306/barath";
	            String user = "root";
	            String password = "barath29";
	            con = DriverManager.getConnection(url, user, password);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return con;
	    }

}