package programswithjava8;

import java.util.Arrays;
import java.util.List;

public class PrintSumOfAllNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,5,3,7,4,9,10,25,28,13);
		System.out.println("Sum of Elements is: "+getSum(list));
	}
	
	/*
	 * Description: Helper function to get sum of all numbers from a List of Integers using Java 8
	 * Created by: Poonam Kadam 
	 * Created Date: 04/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static int getSum(List<Integer> list) {
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}

}
