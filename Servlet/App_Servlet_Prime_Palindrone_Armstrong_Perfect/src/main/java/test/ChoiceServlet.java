package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/cal")
public class ChoiceServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
	String value = req.getParameter("button");
	if(value.equals("PrimeNo"))
	{
		RequestDispatcher rd=req.getRequestDispatcher("/prime");
		rd.forward(req, res);
	}
	else if(value.equals("PalindromeNo"))
	{
		RequestDispatcher rd=req.getRequestDispatcher("/palindrome");
		rd.forward(req, res);
	}
	else if(value.equals("ArmstrongNo"))
	{
		RequestDispatcher rd=req.getRequestDispatcher("/armstrong");
		rd.forward(req, res);
	}
	else
	{
		RequestDispatcher rd=req.getRequestDispatcher("perfect");
		rd.forward(req, res);
	}
	}

	
  
}
