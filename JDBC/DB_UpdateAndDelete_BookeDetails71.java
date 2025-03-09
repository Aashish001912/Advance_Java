package com.test;

import java.util.*;
import java.sql.*;

public class DB_UpdateAndDelete_BookeDetails71 
{
   public static void main(String[] args) 
   {
	Scanner sc= new Scanner(System.in);
	try(sc;)
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
		 
	    Statement st=con.createStatement();
	    System.out.println("Enter the Book code to perform update/delete operation");
	    int bcode=sc.nextInt();
	    ResultSet rs=st.executeQuery("Select * from BookDetails71 where code="+bcode+"");
	    
	    if(rs.next())
	    {
	    	System.out.println("=====choice=====");
	    	System.out.println("\t.Update"+"\n\t2.delete");
	    	System.out.println("Enter your choice:");
	    	int choice=sc.nextInt();
	    	
	    	switch(choice)
	    	{
	    	case 1:
	    	System.out.println("-----Perform Update Operations------");
	    	System.out.println("Old Book Price:"+rs.getFloat(4));
	    	System.out.println("Enter the New Book Price:");
	    	float nPrice = sc.nextFloat();
	    	System.out.println("Existing Book qty:"+rs.getInt(5));
	    	System.out.println("Enter the New Book qty:");
	    	int nqty=sc.nextInt();
	    	int k=st.executeUpdate("Update BookDetails71 set price="+nPrice+",qty=qty+"+nqty+" where code="+bcode+"");
	    	
	    	if(k>0)
	    	    {
	    		System.out.println("Book details updated Successfully...");
	    		}
	    		break;
	    	case 2:
	    		int k2 = st.executeUpdate
	    		("delete from BookDetails71 where code="+bcode+"");
	    		if(k2>0)
	    		{
	    		System.out.println("Book Details deleted Successfully...");
	    		}
	    		break;
	    	default:
	    		System.out.println("Invalid Choice...");

	    	}

	    }
	    else {
	    	System.out.println("Invalid BookCode...");
	    }
	}
	catch (Exception e)
	{
	  e.printStackTrace();
	}
   }
}
