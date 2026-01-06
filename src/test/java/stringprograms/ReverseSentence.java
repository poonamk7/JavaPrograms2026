package stringprograms;

public class ReverseSentence {
	
	
	public static void main(String[] args) {
		
		String input = "This is Java Program";
		System.out.println("Reversed Statement is: "+reverseSentence(input));
	}
	
	
	/*
	 * Description: Helper function to reverse the sentence
	 * Created by: Poonam Kadam 
	 * Created Date: 06/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static String reverseSentence(String input) {
		
		 String[] words = input.split(" ");
		 String reversed= "";
		 
		 for(int i=words.length-1; i>=0; i--) {
			 
			 reversed = reversed+words[i]+" ";
			 
		 }
		
		return reversed;
	}

}
