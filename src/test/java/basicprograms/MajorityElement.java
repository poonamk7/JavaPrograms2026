package basicprograms;

public class MajorityElement {

	// This Java program is to find Majority element from a given array.
//	Majority element is an element that has appeared more than n/2 times in a given array
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,5,1,1,7,7,1,1}; //here 1 is appeared more than n/2 [n=length of an array]
		
		System.out.println("Majority element is: "+getMajorityelement(arr));
	}
	
	
	/* Description: Helper function to get Majority element
	   Created by: Poonam Kadam
	   Created Date: 03/01/2026
	   Modified Date:
	   Modified By: 
	*/
	public static int getMajorityelement(int[] arr) {
		
		int count=0, candidate=-1;
		
		for(int num : arr) {
			
			if(count==0) {
				candidate=num;
			}
			
			count+= (num==candidate)?1:-1;
		}
		
		return candidate;
		
	}

}
