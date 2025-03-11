package com.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB_Find_MetaData 
{
	public static void main(String[] args) 
	{
	  try
	  { 
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con = DriverManager.getConnection
		  ("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");  
	      System.out.println("*******DataBaseMetaData********");
	      DatabaseMetaData dmd=con.getMetaData();
	      System.out.println("Prod-Version:"+dmd.getDatabaseProductName());
	      System.out.println("Prod-Name:"+dmd.getDatabaseProductVersion());
	      System.out.println("Driver Name : "+dmd.getDriverName());
	      System.out.println("Max Tabs :"+dmd.getMaxColumnNameLength());
	  }
	  catch (Exception e)
	  {
		e.printStackTrace();
	  }
	}

}
