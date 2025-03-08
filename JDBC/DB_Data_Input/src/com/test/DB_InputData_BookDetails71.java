package com.test;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DB_InputData_BookDetails71 {

	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
        try (sc;){
        
        	System.out.println("Enter the Book-code:");
        	int bcode=Integer.parseInt(sc.nextLine());
       
        	System.out.println("Enter the Book-Name:");
        	String bname = sc.nextLine();
        	
        	System.out.println("Enter the Book-Author:");
        	String bauthor = sc.nextLine();
        	
        	System.out.println("Enter the Book-Price:");
        	float bprice = Float.parseFloat(sc.nextLine());
        	
        	System.out.println("Enter the Book-Qty:");
        	int bqty = Integer.parseInt(sc.nextLine());
        	
        	
        	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
		
		Statement st= con.createStatement();
		int k=st.executeUpdate
		("insert into BookDetails71 values("+bcode+",'"+bname+"','"+bauthor+"',"+bprice+","+bqty+")");
        
        if(k>0)
        {
        	System.out.println("Book details inserted successfully");
        }
        con.close();
        
	}catch (Exception e)
        {
		e.printStackTrace();
		}

}
}
