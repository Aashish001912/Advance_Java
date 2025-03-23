package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/armstrong")
@SuppressWarnings("serial")
public class ArmstrongServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int num = Integer.parseInt(req.getParameter("number"));
		
		int originalNum=num,sum=0,digits = String.valueOf(num).length();
		while(num>0)
		{
			int digit=num%10;
			sum+=Math.pow(digit, digits);
			num=num/10;
		}
	
		if(sum==originalNum)
		{
			pw.println(originalNum+" is a Armstrong No");
		}
		else 
		{
			pw.println(originalNum+" is a Not Armstrong No");
		}
	}

}
