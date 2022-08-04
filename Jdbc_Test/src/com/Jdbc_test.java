package com;

import java.sql.*;
public class Jdbc_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
		}
		catch (Exception e) {
			System.out.println(e);
			
		}

	}

}
