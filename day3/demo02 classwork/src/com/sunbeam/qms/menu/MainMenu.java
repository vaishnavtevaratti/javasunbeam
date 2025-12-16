package com.sunbeam.qms.menu;

import java.util.Scanner;


public class MainMenu {
	
	public static  int mainMenuOptions(Scanner sc) {
		System.out.println("0.exit");
		System.out.println("1.Admin Login  ");
		System.out.println("2.Student Register");
		System.out.println("3.Student Login");
		System.out.println(" enter your choice: ");

		return sc.nextInt();
	}
	
	public static void mainMenu(Scanner sc) {
		
		int choice ;
		while ((choice = mainMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("you have selected Admin Login");
				Adminmenu.adminMenu(sc);
				break;
			case 2:
				System.out.println("you have selected Student Register");
				break;
			case 3:
				System.out.println("you have selected Student Login ");
				StudentMenu.studentMenu(sc);
			
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}
		}
		
	}
	

}
