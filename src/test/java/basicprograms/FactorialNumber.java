package basicprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		// traditional approach
		System.out.println("Factorial of " + num + " is: " + findFactorial(num));

		// using recursion:
		System.out.println("Factorial of " + num + " is (using Recursion): " + findFactorialWithRecursion(num));
	}

	/*
	 * Description: Helper function to calculate factorial of a given number(Traditional approach) 
	 * Created by: Poonam Kadam 
	 * Created Date: 03/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static int findFactorial(int num) {

		int factorial = 1;

		if (num == 0 || num == 1) {
			return 1;
		}

		for (int i = 2; i <= num; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

	/*
	 * Description: Helper function to find factorial using recursion 
	 * Created by: Poonam Kadam C
	 * reated Date: 03/01/2026 
	 * Modified Date: 
	 * Modified By:
	 */

	public static int findFactorialWithRecursion(int num) {

		if (num == 0 || num == 1) { //base case
			return 1;
		}

		return num * findFactorialWithRecursion(num - 1); //recursive case
	}

}
