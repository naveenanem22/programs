package array;

import java.util.Arrays;

//This program is to verify if a given interger is present in an array of integers
public class CheckInteger {

	public boolean verifyIntegerPresent(int[] arr, int n) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n)
				return true;
		}

		return false;
	}

	// Complexity: Heap Sort - O(n log n) + Binary Search - O(log n) => O(n log n)
	public boolean verifyIntegerPresentWithBinarySearch(int[] arr, int n) {
		Arrays.sort(arr, 0, arr.length);
		
		//Print sorted array
		Arrays.stream(arr).forEach(element -> {
			System.out.print(element+", ");
		});

		// Binary Search
		return binarySearch(arr, 0, arr.length - 1, n);
	}

	public boolean binarySearch(int[] arr, int l, int r, int element) {
		System.out.println("l: "+l+"r: "+r);
		if (l == r) {
			if(arr[l] == element)
				return true;
			else 
				return false;
		}
			
		int m = (l + r) / 2;
		System.out.println("m: "+m);

		if (arr[m] == element) {
			System.out.println("arr[m]: "+arr[m]);
			return true;
		}
			

		else if (element > arr[m]) {
			l = m + 1;
			return binarySearch(arr, l, r, element);
		}
		else if( element < arr[m]) {
			r = m-1;
			return binarySearch(arr, l, r, element);
		}

		return false;
	}

}
