package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program01 {
	public static final String URL = "jdbc:mysql://localhost:3306/classwork";
	public static final String USERNAME = "root";
	public static final String PASSWORD ="manager";
	  
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}	
	
	public static void getAllStudents() {
		String sql ="select * from student";
		
		try {
			Connection connection = getConnection();
			PreparedStatement selectStatement =connection.prepareStatement(sql);
			ResultSet rs = selectStatement.executeQuery();
			
			while(rs.next()) {
				int rollno = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String course = rs.getString(4);
				System.out.println(rollno + " - " + name + " - " + email + " - " + course);
				
			}	
			connection.close();
			selectStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void addStudent() {
		int rollno =14;
		String name = "Suresh";
		String email = "suresh@gmail.com";
		String course = "Java";

		String sql = "INSERT INTO student(rollno,name,email,course) VALUES(?,?,?,?)";
		try {
			Connection connection = getConnection();
			PreparedStatement insertStatement = connection.prepareStatement(sql);
			insertStatement.setInt(1, rollno);
			insertStatement.setString(2, name);
			insertStatement.setString(3,email);
			insertStatement.setString(4, course);
			insertStatement.executeUpdate();
			connection.close();
			insertStatement.close();
			System.out.println("Student is inserted...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void updateStudent() {
	
		String sql = "update student "
				+ "set name='vaishanv' "
				+ "where rollno =14";
		try {
			Connection connection = getConnection();
			PreparedStatement updateStatement = connection.prepareStatement(sql);
			updateStatement.executeUpdate();
			connection.close();
			updateStatement.close();
			System.out.println("Student is updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteStudent() {
		
		String sql = "delete from student where rollno =14";
		try {
			Connection connection = getConnection();
			PreparedStatement deleteStatement = connection.prepareStatement(sql);
			deleteStatement.executeUpdate();
			connection.close();
			deleteStatement.close();
			System.out.println("Student is deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
		
	
	



	public static void main(String[] args) {
	 getAllStudents();
	 //addStudent() ;
	//updateStudent();
	 //deleteStudent() ;
	}

}
