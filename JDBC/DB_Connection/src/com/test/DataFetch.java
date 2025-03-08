package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataFetch {
  public static void main(String[] args) {
	
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection cons=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
	 
          
		  Statement st= cons.createStatement();
		  
		  System.out.println(" Id     Name");
		  ResultSet rs=st.executeQuery("select * from stud");
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+" , "+rs.getString(2) );
		 }

	      System.out.println();
	      
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
}
}
