package array;

public class RemoveDuplicatesSortedArray {

	static int removeDuplicates(int arr[], int n) {
		if (n == 0 || n == 1)
			return n;

		// To store index of next unique element
		int j = 0;

		// Doing same as done in Method 1
		// Just maintaining another updated index i.e. j
		for (int i = 0; i < n - 1; i++) {
			System.out.println("Iteration: "+i);
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j=j+1;
			}
				
			for(int item: arr) {
				System.out.print(item+",");
			}
			
		}

		arr[j++] = arr[n - 1];

		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6 };
		int n = arr.length;

		n = removeDuplicates(arr, n);

		// Print updated array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
