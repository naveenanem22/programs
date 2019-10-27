package array;

import java.util.Hashtable;

public class FindDuplicates {

	public void usingHashTable(int[] arr) {
		Hashtable<Integer, Integer> duplicateCounter = new Hashtable<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(duplicateCounter.get(arr[i]) == null) {
				duplicateCounter.put(arr[i],1);
			}
			else {
				int counter = duplicateCounter.get(arr[i]);
				counter++;
				duplicateCounter.put(arr[i], counter);
			}
				
		}
		
		//Printing the hashtable
		duplicateCounter.forEach((item, count) -> {
			if(count > 0) {
				System.out.println("Item: "+item+" - "+"Count: "+count);
			}
		});

	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,4,5,5,5,6,7,7,7,7,8,8,9};
		FindDuplicates findDuplicates = new FindDuplicates();
		findDuplicates.usingHashTable(arr);
		
	}

}
