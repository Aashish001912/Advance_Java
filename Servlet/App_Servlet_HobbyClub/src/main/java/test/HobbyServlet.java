package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/hobby")
public class HobbyServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String Name=req.getParameter("name");
		String[]hobbies=req.getParameterValues("hobby");
		
		pw.println("<h2>Hello "+Name+", Your Hobbies Are:</h2>");
		
		if(hobbies!=null)
		{
			for(String hobby:hobbies)
			{
				pw.println("<p>"+hobby+"</p>");
			}
		}
		else
		{
			pw.println("<p>NO hobbies is seleted.</p>");
		}
	}

	
}
