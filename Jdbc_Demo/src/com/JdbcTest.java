package com;

import java.sql.*;
public class JdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Msdrohith@7");
System.out.println("Connected successfully");
Statement stmt = con.createStatement();
System.out.println("Statement is ready...");


//insert operation
//int res = stmt.executeUpdate("insert into employee values (5, 'Mahesh', 12000)");
//if (res>0) {
	System.out.println("Record inserted successfully");
//}
// delete query
//int res = stmt.executeUpdate("delete from employee where id = 5");
//if(res>0) {
	//System.out.println("Record deleted successfully");
//}
//else {
	//System.out.println("Record not present");
	 
//}
	//update query
	//int res = stmt.executeUpdate("update employee set salary = 4500 where id=10");
	//if(res>0) {
		//System.out.println("Record updated successfully");
	//}
	//else {
		//System.out.println("Record not present");
	//}
	
	//retrieve query
	//ResultSet rs = stmt.executeQuery("select * from employee");
	//while(rs.next())	 {
	//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
	//}
	//rs.close();
	stmt.close();
	con.close();
			} catch (Exception e) {
	}
		//System.out.println(e);
	
	}
	
}
//}


