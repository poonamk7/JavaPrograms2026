package arrayprograms;

import java.util.Arrays;

public class ShiftNegativesToLeftAndZeroInMiddle {
	
	//Java program to shift all negative numbers to the left followed by all zeroes in the middle and positive(non zero numbers) in the beginning
	
	public static void main(String[] args) {
		
		int[] arr = {0,3,-2,0,-3,4,9,7,0,-1,5};
		System.out.println("Output: "+Arrays.toString(shiftElements(arr) ));
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

}
