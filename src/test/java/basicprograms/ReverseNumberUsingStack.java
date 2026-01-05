package basicprograms;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumberUsingStack {
	
	public static void main(String[] args) {
		
		System.out.println("Ener a number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("Reverse of "+num+" is: "+reverse(num));
	}
	
	/*
	 * Description: Helper function to reverse a number using Stack
	 * Created by: Poonam Kadam 
	 * Created Date: 05/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static int reverse(int num) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int result=0, i=1;
		
		while(num!=0) {
			int digit = num%10;
			stack.push(digit);
			num=num/10;
		}
		
		while(!stack.isEmpty()) {
			result=result+(stack.peek()*i);
			stack.pop();
			i=i*10;
		}
		
		return result;
	}

}
