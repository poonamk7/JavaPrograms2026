package stringprograms;

public class StringCompression {
	
	public static void main(String[] args) {
		
		String input = "aabbbffffrrrrrs"; //a2b3f4r5s1
		System.out.println("Compressed String is: "+compressString(input));
	}
	
	
	/*
	 * Description: Helper function to return compressed String
	 * Created by: Poonam Kadam 
	 * Created Date: 05/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static String compressString(String input) {
		
		StringBuilder builder = new StringBuilder();
		int count=0;
		
		for(int i=0; i<input.length(); i++) {
			count++;
			if(i==input.length()-1 || input.charAt(i)!=input.charAt(i+1)) {
				builder.append(input.charAt(i));
				builder.append(count);
				count=0;
			}
		}
		
		return builder.toString();
	}

}
