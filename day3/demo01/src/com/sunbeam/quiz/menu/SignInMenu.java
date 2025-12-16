package com.sunbeam.quiz.menu;

import java.util.Scanner;

public class SignInMenu {
	private static  int signInMenuOptions(Scanner sc) {
		System.out.println("0.signout");
		System.out.println("1.attemptquiz");
		System.out.println("2.display marks ");
		System.out.println("3.display profile ");
		System.out.println("4.update profile ");

		System.out.println(" enter your choice: ");

		return sc.nextInt();
	}

	public static void signInMenu(Scanner sc) {
		int choice ;
		while ((choice = signInMenuOptions(sc)) != 0) {
			switch (choice) {
			case 1:
				System.out.println("Attempt Quiz Case Selected");
				break;
			case 2:
				System.out.println("Display Marks Case Selected");
				break;
			case 3:
				System.out.println("Display Profile Case Selected");
				break;
			case 4:
				System.out.println("Update profile Case Selected");
				break;
			default:
				System.out.println("Wrong Choice...");
				break;
			}
		}
		}
		 
}
