package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Data_Fetch_Product71
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			
			Statement st= con.createStatement();
			
			System.out.println("Pcode   Pname    Pprice    Pqty ");
			ResultSet rs=st.executeQuery("select * from product71");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" \t"+rs.getString(2)+" \t"+rs.getInt(3)+" \t"+rs.getInt(4));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
