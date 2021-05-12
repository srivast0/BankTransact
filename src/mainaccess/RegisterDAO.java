package mainaccess;
import java.sql.*;

import javax.servlet.ServletRequest;
public class RegisterDAO 
{
	public int k;
	public int insert(ServletRequest req)
	{
		try
		{
			Connection con=DBConnection.getcon();
			String Uname=req.getParameter("username");
			String pswrd=req.getParameter("password");
			String Fname=req.getParameter("firstname");
			String Lname=req.getParameter("lastname");
			String addrs=req.getParameter("address");
			long mob=Long.parseLong(req.getParameter("mobile"));
			long opbal=Long.parseLong(req.getParameter("openbal"));
			PreparedStatement ps=con.prepareStatement("insert into consumer values(?,?,?,?,?,?,?,?)");
			ps.setDouble(1, Math.random());
			ps.setString(2, Uname);
			ps.setString(3, pswrd);
			ps.setString(4, Fname);
			ps.setString(5, Lname);
			ps.setString(6, addrs);
			ps.setLong(7, mob);;
			ps.setLong(8, opbal);
			
			 k=ps.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return k;
	}
}
