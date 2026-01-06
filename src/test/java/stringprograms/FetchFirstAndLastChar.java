package stringprograms;

public class FetchFirstAndLastChar {
	
	public static void main(String[] args) {
		
		String input = "This is Java Program";
		fetchChars(input);
	}
	
	/*
	 * Description: Helper function to print first and last character of each word in a String
	 * Created by: Poonam Kadam 
	 * Created Date: 06/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static void fetchChars(String input) {
		
		String[] words = input.split(" ");
		
		char first= ' ', last= ' ';

		for(String word : words) {
			
			System.out.println("Word: "+word+"| Firt Character: "+word.charAt(0)+" | last character is: "+word.charAt(word.length()-1));
			
		}
		
	}
	

}
