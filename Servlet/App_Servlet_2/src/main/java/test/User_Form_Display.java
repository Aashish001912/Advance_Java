package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/user")
public class User_Form_Display implements Servlet 
{

	@Override
	public void destroy() 
	{
		
	}

	@Override
	public ServletConfig getServletConfig() 
	{
		return null;
	}

	@Override
	public String getServletInfo() 
	{
		return null;
	}

	@Override
	public void init(ServletConfig conf) throws ServletException 
	{
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String uId=req.getParameter("userid");
		String uFName=req.getParameter("userfname");
		String uLName=req.getParameter("userlname");
		String uMid=req.getParameter("usermid");
		long uPhNo=Long.parseLong(req.getParameter("userphno"));
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("User-Id :"+uId+"<br>");
		pw.println("User-FirstName :"+uFName+"<br>");
		pw.println("User-LastName :"+uLName+"<br>");
		pw.println("User-MailId :"+uMid+"<br>");
		pw.println("User-PhNo :"+uPhNo+"<br>");
	}
  
}
