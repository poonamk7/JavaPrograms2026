package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringCharacter {
	
	public static void main(String[] args) {
		
		String input="programmming";
		findMaxOccuringChar(input);
	}
	
	
	/*
	 * Description: Helper function to return compressed String
	 * Created by: Poonam Kadam 
	 * Created Date: 05/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static void findMaxOccuringChar(String input) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<input.length(); i++) {
			map.put(input.charAt(i), map.getOrDefault(input.charAt(i), 0)+1);
		}
		
		Map.Entry<Character, Integer> maxEntry = null;
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(maxEntry == null || entry.getValue().compareTo(maxEntry.getValue())>0) {
				maxEntry=entry;
			}
		}
		
		System.out.println("Maximu occuring character is: "+maxEntry.getKey()+" with occurrence: "+maxEntry.getValue());
	}

}
