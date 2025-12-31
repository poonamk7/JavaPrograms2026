package basicprograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		System.out.println(num+" "+(isPrimeNumber(num)? "is a Prime number" :"not a Prime number"));
		
	}
	
	public static boolean isPrimeNumber(int num) {
	
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	

}
