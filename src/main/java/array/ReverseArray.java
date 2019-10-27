package array;

//reverse array inplace
public class ReverseArray {

	public int[] reverseArrayInPlace(int[] arr) {
		int n = arr.length;
		int temp = 0;
		int j = 0;
		for (int i = 0; i < n; i++) {
			// swap i and n-1-i
			j = n - 1 - i;
			if (i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		return arr;
	}
	
	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		int[] arr = {10,20,30,40,50};
		reverseArray.reverseArrayInPlace(arr);
		for(int item: arr)
			System.out.println(item);
	}

}
