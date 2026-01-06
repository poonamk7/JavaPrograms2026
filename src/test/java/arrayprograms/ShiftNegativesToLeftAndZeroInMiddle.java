package arrayprograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ShiftNegativesToLeftAndZeroInMiddle {
	
	//Java program to shift all negative numbers to the left followed by all zeroes in the middle and positive(non zero numbers) in the beginning
	
	public static void main(String[] args) {
		
		int[] arr = {0,3,-2,0,-3,4,9,7,0,-1,5};
//		System.out.println("Output: "+Arrays.toString(shiftElements(arr) ));
		
		System.out.println("Result: "+Arrays.toString(sortingUsingJava8(arr)));
	}
	
	
	/*
	 * Description: Helper function to arrange elements with nonzero numbers in the beginning followed by zeroes followed by negative numbers
	 * Created by: Poonam Kadam 
	 * Created Date: 06/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static int[] shiftElements(int[] arr) {
		
		int index=0;
		int[] result = new int[arr.length];
		
		for(int num: arr) {
			if(num>0) {
				result[index++]=num;
			}
		}
		
		for(int num: arr) {
			if(num==0) {
				result[index++]=num;
			}
		}
		
		for(int num: arr) {
			if(num<0) {
				result[index++]=num;
			}
		}
		
		return result;
		
	}
	
	/*
	 * Description: Helper function to arrange elements with nonzero numbers in the beginning followed by zeroes followed by negative numbers using Java 8
	 * Created by: Poonam Kadam 
	 * Created Date: 06/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static int[] sortingUsingJava8(int[] arr) {
		
		int[] result = IntStream.concat
				(IntStream.concat(Arrays.stream(arr).filter(x -> x>0), Arrays.stream(arr)
						.filter(x -> x==0)), Arrays.stream(arr).filter(x -> x<0)
						).toArray();
		
		return result;
	}

}
