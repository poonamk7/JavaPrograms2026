package programswithjava8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverageOfAllNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("Average of given numbers is: "+getAverage(list));
		
	}
	
	public static double getAverage(List<Integer> list) {
		
		double average =list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		return average;
	}

}
