package com.test;

import java.sql.*;
import java.util.*;

public class DB_InputData_IntoDB_emp_Info
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    try(sc;)
	    {
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	   	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
	   	 
	   	 System.out.println("Enter the Emp-Id:");
	   	 int empId=Integer.parseInt(sc.nextLine());
	   	 
	   	 System.out.println("Enter the Emp-Name:");
	   	 String empName=sc.nextLine();
	   	 
	   	 System.out.println("Enter the Emp-Address:");
	   	 String empAddress=sc.nextLine();
	   	 
	   	 System.out.println("Enter the Emp-EmialId:");
	   	 String empMainId=sc.nextLine();
	   	
	   	 System.out.println("Enter the Emp-PhNo:");
	   	 long empPhNo=Long.parseLong(sc.nextLine());
	   	 
	   	 System.out.println("Enter the Emp-Resume:");
	   	 String empResume=sc.nextLine();
	   	 
	   	 Statement st=con.createStatement();
	   	 int k=st.executeUpdate("insert into emp_info values ("+empId+",'"+empName+"','"+empAddress+"','"+empMainId+"',"+empPhNo+",'"+empResume+"')");
	   	 
	   	 if(k>0)
	   	 {
	   		 System.out.println("Data Insert sucessfully into emp_info");
	   		 
	   	 }
	   	 else
	   	 {
	   		 System.err.println("Invlaid process");
	   		 
	   	 }
	   	 con.close();
	    }
	    catch (Exception e)
	    {
		e.printStackTrace();
		
	    }
	}

}
