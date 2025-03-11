package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class DB_FindResultMetaData_Student_info 
{
	public static void main(String[] args)
	{
	 try 
	 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con = DriverManager.getConnection
		 ("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");	 
	      
	     System.out.println("******ResultSetMetaData*******");
	     PreparedStatement ps=con.prepareStatement("select stuId,stuName,stuRollNo,stuAddress,stuDOA from student71");
	     ResultSet rs=ps.executeQuery();
	     ResultSetMetaData rsmd=rs.getMetaData();
	     System.out.println("Col-count:"+rsmd.getColumnCount());
	     System.out.println("Col-Name:"+rsmd.getColumnName(3));
	     System.out.println("Col-type:"+rsmd.getColumnClassName(3));
	 }
	 
	 catch (Exception e) 
	 {
       e.printStackTrace();
	 }
	}

}
