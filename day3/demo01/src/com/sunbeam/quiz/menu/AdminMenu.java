package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class AdminMenu {
	private static  int adminMenuOptions(Scanner sc) {
		System.out.println("0.signout");
		System.out.println("1.add a new quiz");
		System.out.println("2. schedule the quiz ");
		System.out.println("3.display profile ");
		System.out.println("4.update profile ");

		System.out.println(" enter your choic: ");

		return sc.nextInt();
	}

	public static void adminMenu(Scanner sc) {
		int choice ;
		while ((choice = adminMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Add a new Quiz Case Selected");
				break;
			case 2:
				System.out.println("Schedule the Quiz Case Selected");
				break;
			case 3:
				System.out.println("Display All Students Case Selected");
				break;
			case 4:
				System.out.println("Find the Student Case Selected");
				break;
			case 5:
				System.out.println("Delete Student Case Selected");
				break;
			case 6:
				System.out.println("Update Student Case Selected");
				break;
			default:
				System.out.println("Wrong Choice...");
				break;
			}
		}
		 }
}
