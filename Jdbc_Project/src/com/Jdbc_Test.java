package com;
import java.sql.*;
public class Jdbc_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "Msdrohith@7");
			System.out.println("Connected successfully");
		
		Statement stmt = con.createStatement();
		System.out.println("Statement is ready...");
		
		int res = stmt.executeUpdate("insert into employee values (2, 'Raj', 12000)");
		if(res>0) {
			System.out.println("Record inserted successfully");
		}
		
		int res1 = stmt.executeUpdate("delete from employee where id = 2");
		if(res1>0) {
			System.out.println("Record deleted successfully");
		}
		else {
			System.out.println("Record not present");
			 
		}
		stmt.close();
		con.close();
	}
		catch (Exception e) {
			System.out.println(e);
		
		}
		
		

	}

}
