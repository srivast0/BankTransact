package mainaccess;
import java.sql.*;

public class DBConnection {
	public static Connection con;
	private DBConnection() {}
	static
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			
		}catch(SQLException|ClassNotFoundException ob)
		{
			ob.printStackTrace();
		}
	}
	static Connection getcon()
	{
		return con;
	}
}
