package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	// This Java program is to find Majority element from a given array.
//	Majority element is an element that has appeared more than n/2 times in a given array
	
	public static void main(String[] args) {
		
		int[] arr = {7,2,1,7,7,7,8,7,7,2}; //here 1 is appeared more than n/2 [n=length of an array]
		
//		System.out.println("Majority element is: "+getMajorityelement(arr));
		
		System.out.println("Majority element is: "+getMajorityelementUsingHashMap(arr));
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
	
	
	/* Description: Helper function to get Majority element using HashMap
	   Created by: Poonam Kadam
	   Created Date: 03/01/2026
	   Modified Date:
	   Modified By: 
	*/
	public static int getMajorityelementUsingHashMap(int[] arr) {
		int candidate=0;
		Map<Integer, Integer> majorityMap = new HashMap<Integer, Integer>();
		
		for(int num: arr) {
			majorityMap.put(num, majorityMap.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:majorityMap.entrySet()) {
			if(entry.getValue()>(arr.length/2)) {
				candidate=entry.getKey();
			}
		}
		return candidate;
	}
}
