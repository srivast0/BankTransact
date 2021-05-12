package mainaccess;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
@Override
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	ServletContext sct=this.getServletContext();
	LoginDAO ob=new LoginDAO();
	String FName=ob.validate(req,sct);
	if(FName!=null)
	{
		Cookie ck=new Cookie("FName",FName);
		pw.println("Login Successful.");
		pw.println("Welcome!"+FName);
		RequestDispatcher rd=req.getRequestDispatcher("UserHome.html");
		rd.include(req, res);
		res.addCookie(ck);
	}
	
}

}