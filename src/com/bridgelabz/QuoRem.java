package com.bridgelabz;

import java.util.Scanner;

public class QuoRem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st number");
		int num1 = sc.nextInt();

		System.out.print("Enter 2nd number");
		int num2 = sc.nextInt();

		int quotient = num1 / num2;
		int remainder = num1 % num2;

		System.out.println("The quotient is: " + quotient);
		System.out.println("The remainder is: " + remainder);
		sc.close();
	}
}
