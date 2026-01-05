package stringprograms;

public class StringExpansion {
	
	public static void main(String[] args) {
		
		String input = "a4b5c6";
		System.out.println("Expanded String is: "+expandstring(input));
	}
	
	/*
	 * Description: Helper function to return expanded String
	 * Created by: Poonam Kadam 
	 * Created Date: 05/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static String expandstring(String input) {
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i))) {
				builder.append(input.charAt(i));
			}
			else {
				if(Character.isDigit(input.charAt(i))) {
					int num=Character.getNumericValue(input.charAt(i));
					for(int j=1; j<num; j++) {
						builder.append(input.charAt(i-1));
					}
				}
			}
		}
		
		return builder.toString();
		
	}

}
