package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

	public static void main(String[] args) {
		/*
		 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120. Write a java program to
		 * find Factorial of a given number using Recursion as well as
		 * Iteration.
		 *
		 */
		int result = factorial(5);
		System.out.println("The factorial value of entered number is using recursion: " + result);
		int result2 =factorial1(5);
		System.out.println("The factorial value of entered number is using Iterator: " + result2);
	}

	// finding factorial value using recursion
	public static int factorial(int facVal) {
		if (facVal == 0) {
			return 1;
		}
		return facVal * factorial(facVal - 1);
	}

 // finding factorial value using iteration
public static int factorial1(int facVal) {
		int fac = 1;
		for (int j = 1; j <= facVal; j++)
			fac = fac * j;
		return fac;
	}

}
