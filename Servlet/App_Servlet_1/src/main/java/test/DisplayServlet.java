package test;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/dis")
public class DisplayServlet implements Servlet
{
	@Override
	public void init(ServletConfig scf) throws ServletException 
	{
	    //NoCode	
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String cId=req.getParameter("cid");
		String cName=req.getParameter("cname");
		String cCity=req.getParameter("ccity");
		String mid=req.getParameter("cmid");
		long phNo=Long.parseLong(req.getParameter("cphno"));
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		pw.println("CustId:"+cId+"<br>");
		pw.println("CustName:"+cName+"<br>");
		pw.println("CustCity:"+cCity+"<br>");
		pw.println("CustMailId:"+mid+"<br>");
		pw.println("CustIPhoneNo:"+phNo+"<br>");
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
	public void destroy()
	{
		//NoCode		
	}


 
}
