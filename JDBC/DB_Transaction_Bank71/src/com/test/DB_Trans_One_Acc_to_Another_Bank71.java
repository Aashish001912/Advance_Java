package com.test;
import java.sql.*;
import java.util.*;

public class DB_Trans_One_Acc_to_Another_Bank71 
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
			 
			PreparedStatement ps1=con.prepareStatement("select * from bank71 where accno=?");
			PreparedStatement ps2=con.prepareStatement("update Bank71 set balance=balance+? where accNo=?");
			System.out.println("commit status :"+con.getAutoCommit());
			con.setAutoCommit(false);
			System.out.println("commit status :"+con.getAutoCommit());
			
			//
			System.out.println("Enter the HomeAccNo:");
			long hAccNo=sc.nextLong();
			ps1.setLong(1, hAccNo);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next()){
				
				float bal=rs1.getFloat(3);
				System.out.println("Enter benificaryAccNo:");
				long bAccNo=sc.nextLong();
				ps1.setLong(1, bAccNo);
				ResultSet rs2=ps1.executeQuery();
				if(rs2.next())
				{
					System.out.println("Enter the ammount to be tanferred:");
					float amt=sc.nextFloat();
					if(amt<=bal)
					{
					// statement 1:subtract amount 5000/ from accNo:612345
						ps2.setFloat(1, -amt);
						ps2.setLong(2, hAccNo);
						int p=ps2.executeUpdate();//updated in buffer
					// statement 2:add amount 5000/ to accNo:712345
						ps2.setFloat(1, +amt);
						ps2.setLong(2, bAccNo);
						int q=ps2.executeUpdate();//updated buffer
						if(p==1 && q==1)
						{
							con.commit();
							System.out.println("Transaction sucessfully...");
						}
						else {
							con.rollback();
							System.out.println("Transaction Failed...");
						}
					}
					else {
						System.out.println("Insufficient Fund...");
					}
					
				}
				else {
					System.out.println("Invalid bAccNo...");
				}
			}
			else {
				System.out.println("Invalid HomeAccNo...");
			}
		}
		catch (Exception e)
		{
		  e.printStackTrace();
		}
	}
}
