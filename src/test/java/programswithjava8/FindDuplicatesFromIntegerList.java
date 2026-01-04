package programswithjava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicatesFromIntegerList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 5, 7, 8, 7, 9);
		findDuplicate(list);
	}

	
	/*
	 * Description: Helper function to find duplicates from a List of Integers using Java 8
	 * Created by: Poonam Kadam 
	 * Created Date: 04/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static void findDuplicate(List<Integer> list) {

		list.stream().filter(x -> Collections.frequency(list, x) > 1).collect(Collectors.toSet())
				.forEach(System.out::println);

	}

}
