package mainaccess;
import javax.servlet.*;
import java.sql.*;
public class LoginDAO {

public String FName;
public String validate(ServletRequest req,ServletContext sct)
{
	try
	{
	Connection con=DBConnection.getcon();
	String Uname=req.getParameter("username");
	String pswrd=req.getParameter("password");
	PreparedStatement ps=con.prepareStatement("select * from consumer where username=? and password=?");
	ps.setString(1, Uname);
	ps.setString(2, pswrd);
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		FName=rs.getString(4);
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return FName;
}
	
}
