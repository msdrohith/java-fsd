package com;
import java.sql.*;
public class JdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println(Driver loaded successfully);
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
