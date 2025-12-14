package com.sunbeam;

import java.util.Scanner;

public class LengthCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            int length = input.length();

            if (length > 20) {
                throw new ExceptionLineTooLong("The string is too long");
            }

            System.out.println("String length: " + length);

        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
