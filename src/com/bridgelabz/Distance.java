package com.bridgelabz;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// initialization
		double x = 0;
		double y = 0;
		// user inputs
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x co-ordinate");

		x = scanner.nextDouble();
		System.out.println("Enter y co-ordinate");
		y = scanner.nextDouble();
		// calculating distance value
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		// print distance value
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
		scanner.close();
	}
}
