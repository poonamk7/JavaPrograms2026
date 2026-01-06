package stringprograms;

public class ReverseOnlyAlphabets {
	
	//Java program to reverse only alphabets by preserving the position of special characters and numbers
	
	public static void main(String[] args) {
		
		String input = "A#u74tO%m!ati46&on";
		
		System.out.println("Reversed string is :"+reverseOnlyAlphabets(input));
	}
	
	
	/*
	 * Description: Helper function to reverse only alphabets by preserving the position of special characters and numbers
	 * Created by: Poonam Kadam 
	 * Created Date: 06/01/2026 
	 * Modified Date:
	 * Modified By:
	 */
	public static String reverseOnlyAlphabets(String input) {
		
		char[] ch  =input.toCharArray();
		
		int start=0, end=input.length()-1;
		
		while(start<end) {
			if(!Character.isAlphabetic(ch[start])) {
				start++;
			}
			else if(!Character.isAlphabetic(ch[end])) {
				end--;
			}
			else {
				char temp = ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		
		return new String(ch);
		
	}

}
