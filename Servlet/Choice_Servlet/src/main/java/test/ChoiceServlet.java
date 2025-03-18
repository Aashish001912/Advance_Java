package test;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")

public class ChoiceServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
	 String sb=req.getParameter("sb");
	 if(sb.equals("ADD"))
	 {
		 RequestDispatcher rd=req.getRequestDispatcher("ad");
				 rd.forward(req, res);
	 }
	 else if(sb.equals("AVG"))
	 {
		 RequestDispatcher rd=req.getRequestDispatcher("av");
		 rd.forward(req, res);
				 
	 }
	 else if(sb.equals("SUB"))
	 {
		 RequestDispatcher rd=req.getRequestDispatcher("sub");
		 rd.forward(req, res);
				 
	 }
	 else
	 {
		 RequestDispatcher rd=req.getRequestDispatcher("mul");
		 rd.forward(req, res); 
	 }
	 
	}

	

}
