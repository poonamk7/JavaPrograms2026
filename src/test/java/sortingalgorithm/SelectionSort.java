package sortingalgorithm;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 4, 8, 1, 9, 3, 6, 5 };

		System.out.println("Sorted Array using Selection sort: "+Arrays.toString(sortArray(arr)));
	}

	
	/*
	 * Description: Helper function to sort an array using Selection Sort
	 * Created by: Poonam Kadam 
	 * Created Date: 04/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static int[] sortArray(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int min = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;

				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		return arr;

	}

}
