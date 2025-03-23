package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/prime")
public class PrimeServlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int num = Integer.parseInt(req.getParameter("number"));
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			count++;
		}
		if(count==2)
		pw.println("The number "+num+" is prime No");
		else 
			pw.println("The number "+num+" is  not prime No");
		req.getRequestDispatcher("input.html").include(req, res);
	}
 
}
