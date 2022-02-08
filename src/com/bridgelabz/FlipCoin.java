package com.bridgelabz;
import java.util.*;
public class FlipCoin {

	public static void main(String[] args) {
		int headcount = 0, tailcount = 0;
		double headpercentage, tailpercentage;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of times you want to flip the coin");
		int a = sc.nextInt();

		for (int j = 0; j < a; j++) {
			double random = Math.random();
			if (random < 0.5)
				tailcount++;
			else
				headcount++;
		}

		headpercentage = headcount / (double) a * 100;
		tailpercentage = tailcount / (double) a * 100;
		System.out.println("% of heads-" + headpercentage + "%");
		System.out.println("% of tails-" + tailpercentage + "%");
	}
}
