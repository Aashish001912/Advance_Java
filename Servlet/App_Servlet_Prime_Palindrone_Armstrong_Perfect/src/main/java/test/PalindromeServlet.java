package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/palindrome")
@SuppressWarnings("serial")
public class PalindromeServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int num = Integer.parseInt(req.getParameter("number"));
		
		int original=num,reversed=0,remainder;
		
		while(num>0)
		{
			remainder=num%10;
			reversed=reversed*10+remainder;
			num=num/10;
		}
		if(reversed==original)
		{
			pw.println("Number "+original+" is Palindrome");
		}
		else
		{
			pw.println("Number "+original+" is not a Palindrome");
		}
		
	}
}
