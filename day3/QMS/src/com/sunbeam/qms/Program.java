package com.sunbeam.qms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
private static final String URL ="jdbc:mysql://localhost:3306/classwork";
private static final String USERNAME = "roor";
private static final String PASSWORD = "manager";

public static Connection getConnecion() throws SQLException{
	return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	
}
	public static void main(String[] args) {
		public static void getAllStudents() {
			String sql = "SELECT * FROM student";
			try {
				Connection connection = getConnecion();
				PreparedStatement selectStatement = connection.prepareStatement(sql);
				selectStatement.executeQuery();
				
			
				
			}catch (SQLException e){
				e.printStackTrace();
				// TODO: handle exception
			}
	}
		
	
	


		}
	}
