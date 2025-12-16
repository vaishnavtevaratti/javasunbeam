package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class program {
	public static final String URL = "jdbc:mysql://localhost:3306/classwork";
	public static final String USERNAME = "root";
	public static final String PASSWORD ="manager";
	
	
  public static void main(String[] args) {
	  try {
		Connection connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
		
		if(connection !=null) {
			System.out.println("connected sucessfully !");
			connection.close();
		}
		else
			System.out.println("connection failed!");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	  
  }
}