package test;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
@WebServlet("/EmpDis")
public class Empoyee_Form_Display implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String EmpID=req.getParameter("empid");
		String EmpName=req.getParameter("empname");
		String EmpAddress=req.getParameter("empadd");
		Double EmpSalary=Double.parseDouble(req.getParameter("empsal"));
		String EmpGender=req.getParameter("empgen");
		String EmpProfile=req.getParameter("empprofile");
		String EmpHobbies=req.getParameter("emphob");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("Employee ID:"+EmpID+"<br>");
		pw.println("Employee Name:"+EmpName+"<br>");
		pw.println("Employee Address:"+EmpAddress+"<br>");
		pw.println("Employee Salary:"+EmpSalary+"<br>");
		pw.println("Employee Gender:"+EmpGender+"<br>");
		pw.println("Employee Profile:"+EmpProfile+"<br>");
		pw.println("Employee Hobbies:"+EmpHobbies+"<br>");
		
		
	}

}
