package com.bridgelabz;

import java.util.*;

public class LargestAmongThree {

	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st number");
		a = sc.nextInt();
		System.out.println("Enter the 2nd number");
		b = sc.nextInt();
		System.out.println("Enter the 3rd number");
		c = sc.nextInt();

		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");

		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");

		else
			System.out.println(c + " is the largest number");

		sc.close();
	}
}
