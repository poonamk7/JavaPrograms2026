package sortingalgorithm;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr = { 4, 8, 1, 9, 3, 6, 5 };
		
		System.out.println("Sorted Array using Insertion Sort: "+Arrays.toString(sortArray(arr)));
	}
	
	
	/*
	 * Description: Helper function to sort an array using Insertion sort 
	 * Created by: Poonam Kadam 
	 * Created Date: 04/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static int[] sortArray(int[] arr) {
		
		
		for(int i=1; i<arr.length; i++) {
			
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				
				arr[j+1] = arr[j];
				j--;
				
			}
			arr[j+1] = temp;
		}
		
		return arr;
	}

}
