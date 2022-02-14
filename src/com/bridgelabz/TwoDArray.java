package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//user inputs
		System.out.print("Enter number of rows : ");
		int m = sc.nextInt();
		System.out.print("Enter number of columns : ");
		int n = sc.nextInt();

		System.out.println("Enter array elements : ");

		int array[][] = new int[m][n];

		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				array[i][j] = sc.nextInt();
		// accessing array elements
		System.out.println("Elements of the array are: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				// prints the array elements
				System.out.print(array[i][j] + " ");

			System.out.println();
			sc.close();
		}
	}
}
