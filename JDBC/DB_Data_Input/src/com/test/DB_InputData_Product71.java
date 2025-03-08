package com.test;

import java.sql.*;
import java.util.Scanner;


public class DB_InputData_Product71
{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 try(sc;)
	 {
	 System.out.println("Enter the Product code:");
	 int pcode=Integer.parseInt(sc.nextLine());
	 
	 System.out.println("Enter the Product Name:");
	 String pname=sc.nextLine();
	 
	 System.out.println("Enter the Product price:");
	 float pprice=Float.parseFloat(sc.nextLine());
	 
	 System.out.println("Enter the Product code:");
	 int pqty=Integer.parseInt(sc.nextLine());
	 
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
	 
	 Statement st=con.createStatement();
	 int k=st.executeUpdate("insert into Product71 values("+pcode+",'"+pname+"',"+pprice+","+pqty+")");
	 
	 if(k>0)
     {
     	System.out.println("Product details inserted successfully");
     }
	 con.close();
	 }
	 catch (Exception e)
	 {
	  e.printStackTrace();
	 }
	}

}
