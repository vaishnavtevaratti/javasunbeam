package com.sunbeam.quiz.menu;

import java.util.Scanner;


public class MainMenu {
	
	private static  int mainMenuOptions(Scanner sc) {
		System.out.println("0.exit");
		System.out.println("1.signin ");
		System.out.println("2.signup");
		System.out.println("3.Admin");
		System.out.println(" enter your choice: ");

		return sc.nextInt();
	}

	public static void mainMenu(Scanner sc) {
		int choice ;
		while ((choice = mainMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("you have selected signin case");
				SignInMenu.signInMenu(sc);
				break;
			case 2:
				System.out.println("you have selected signup case");
				break;
			case 3:
				System.out.println("you have selected Admin case");
				AdminMenu.adminMenu(sc);
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}
		}
		 }
	
	enum EmainMenu {
		exit ,signin,signup,Admin
	}
	
	public static void mainMenuEnum(Scanner sc) {
		EmainMenu[] arr = EmainMenu.values();
		
		 EmainMenu enumChoice;
		 
		 do {
			 for(EmainMenu ele :arr) 
				 System.out.println(ele.ordinal() + "." + ele.name());
			System.out.print("Enter your choice - ");
			int choice = sc.nextInt();
			enumChoice = arr[choice];
			
			switch (enumChoice) {
			case exit :
				System.out.println("Thank you for using our application");
				break;
			
			case signin :
				System.out.println("you have selected signin case");
				SignInMenu.signInMenu(sc);
				break;
			case signup:
				System.out.println("you have selected signup case");
				break;
			case Admin :
				System.out.println("you have selected Admin case");
				AdminMenu.adminMenu(sc);
				break;

			default:
				System.out.println("Wrong choice...");
				break;
			}
			 
		 }while(enumChoice !=EmainMenu.exit );
	}

}
