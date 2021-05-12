package mainaccess;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class RegisterServet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
	
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		RegisterDAO rd=new RegisterDAO();
		int k=rd.insert(req);
		if(k>0)
		{
			pw.println("User Registered Successfully...");
		}
	
	}

	
}
