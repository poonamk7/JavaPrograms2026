package programswithjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumbersStartingWith2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 222, 276, 364, 23, 967, 57, 29);
		printNumbersStartingWithTwo(list);
	}

	/*
	 * Description: Helper function to print numbers starting with '2' from a List of Integers using Java 8
	 * Created by: Poonam Kadam 
	 * Created Date: 04/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static void printNumbersStartingWithTwo(List<Integer> list) {

		list.stream()
			.map(s -> String.valueOf(s))
			.filter(s -> s.startsWith("2"))
			.map(Integer::valueOf)
			.forEach(System.out::println);

	}

}
