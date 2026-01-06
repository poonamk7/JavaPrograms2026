package stringprograms;

public class ReverseSentenceWithWords {
	
	public static void main(String[] args) {
		
		String input = "This is Java program";
		System.out.println("Output: "+reverseString(input));
	}
	
	/*
	 * Description: Helper function to reverse the sentence along with each word
	 * Created by: Poonam Kadam 
	 * Created Date: 06/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static String reverseString(String input) {
		
		String[] words = input.split(" ");
		String reversed="";
		
		for(int i=words.length-1; i>=0; i--) {
			String reverse="";
			for(int j=words[i].length()-1; j>=0; j--) {
				reverse=reverse+words[i].charAt(j);
			}
			reversed=reversed+reverse+" ";
		}
		
		return reversed;
	}

}
