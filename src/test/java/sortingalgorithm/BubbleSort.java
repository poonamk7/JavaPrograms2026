package sortingalgorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 4, 8, 1, 9, 3, 6, 5 };
		System.out.println("Sorted Array using Bubble sort: " + Arrays.toString(sortArray(arr)));
	}

	/*
	 * Description: Helper function to sort an array using bubble sort
	 * Created by: Poonam Kadam 
	 * Created Date: 04/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static int[] sortArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}

			if (!flag) {
				break;
			}
		}

		return arr;

	}

}
