package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class QmsMain {
	public static final String URL = "jdbc:mysql://localhost:3306/quiz_management";
	public static final String USERNAME = "root";
	public static final String PASSWORD ="manager";
	
	 public static Connection getconnection() throws SQLException {
			return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		 }
	 
	 
	 public static class AdminDao{
		 
		 public static boolean login(String name , String password) {
			 String sql= "select * from users where name =? AND password_hash =? AND role ='Admin'  ";
			  try {
				  Connection connection = getconnection();
				  PreparedStatement ps = connection.prepareStatement(sql);
				  ps.setString(1, name);
				  ps.setString(2, password);
				  ResultSet rs = ps.executeQuery();
				  rs.next();
				if(rs.getString(2).equals(name)&& rs.getString(4).equals(password)) {
					
					return true;
				}
				  
				  connection.close();
				  ps.close();
				
			  }catch (SQLException e) {
				  e.printStackTrace();
				// TODO: handle exception
			}
			  return false ;
			  
			 
		 }
	 }
	 
	 public class StudentDao{
		 
		 public static boolean register(String name , String email , String password ) {
			 String sql = " insert into users(name,email,password_hash,role) values(?,?,?,?)";
			 try {
				 Connection connection = getconnection();
				  PreparedStatement ps = connection.prepareStatement(sql);
				  ps.setString(1, name);
				  ps.setString(2, email );
				  ps.setString(3, password );
				  ps.setString(4, "student" );

				  ps.executeUpdate();
				  connection.close();
				  ps.close();
				  
				return true;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			 return false;
		 }
		 
		 public static boolean login(String name , String password) {
			 String sql="select * from users where name =? AND password_hash =? AND role ='Student'   ";
			  try {
				  Connection connection = getconnection();
				  PreparedStatement ps = connection.prepareStatement(sql);
				  ps.setString(1, name);
				  ps.setString(2, password);
				  ResultSet rs = ps.executeQuery();
				  rs.next();
				  if(rs.getString(2).equals(name)&& rs.getString(4).equals(password)) {
						return true;
					}
				  connection.close();
				  ps.close();
				  return true;
			  }catch (SQLException e) {
				  e.printStackTrace();
				// TODO: handle exception
			}
			  return false;
			 
		 }
		
	 }
	   public static void AdminLogin(Scanner sc) {
		   System.out.println("enter username ");
		   String name = sc.next();
		   System.out.println("enter pasword ");
		   String password = sc.next();
		    if(AdminDao.login(name, password)) {
		    	System.out.println(" login sucseesful");
		    	
		    	
		    }
		    else {
		    	System.out.println("login failed ");
		    } 
	   }
		    public static void StudentRegistration(Scanner sc) {
				   System.out.println("enter username ");
				   String name = sc.next();
				   System.out.println("enter email ");
				   String email = sc.next();
				   
				   System.out.println("enter pasword ");
				   String password = sc.next();
				    if(StudentDao.register(name,email,password)) {
				    	System.out.println(" registration sucseesful");
				    	
				    	
				    }
				    else {
				    	System.out.println("registration failed ");
				    } 
		    }
				   
				    public static void StudentLogin(Scanner sc) {
						   System.out.println("enter username ");
						   String name = sc.next();
						   System.out.println("enter pasword ");
						   String password = sc.next();
						    if(StudentDao.login(name, password)) {
						    	System.out.println(" login sucseesful");
						    	
						    	
						    }
						    else {
						    	System.out.println("login failed ");
						    } 
						   
	   }
				    public static int menu(Scanner sc) {
				    		System.out.println("0.exit");
				    		System.out.println("1.admin login");
				    		System.out.println("2.student registration");
				    		System.out.println("3.student login");
				     
				    		System.out.print("Enter your choice: ");
				         return sc.nextInt();
				    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice ;
	          while((choice = menu(sc))!=0 ) {
	          switch (choice) {
	      
			case 1: {
				AdminLogin( sc);
				break;
				
				
			}
			case 2: {
				StudentRegistration( sc);
				break;
				
				
			}
			case 3: {
				StudentLogin( sc);
				break;
				
				
			}
			default:
				System.out.println("wrong choice!");
			}
		}
		
	          System.out.println("logout sucessful");
		
		

	}

}
