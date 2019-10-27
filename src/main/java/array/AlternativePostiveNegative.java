package array;

public class AlternativePostiveNegative {

	public int[] rearrange(int[] arr) {
		int outOfPlace1 = -1;
		int outOfPlace2 = -1;

		for (int i = 0; i < arr.length; i++) {
			if (isElementOutOfPlace(arr[i], i)) {

				if (outOfPlace1 == -1) {
					// set outOfPlace1
					outOfPlace1 = i;

				} else if (outOfPlace2 == -1) {
					// set outOfPlace2
					outOfPlace2 = i;

				}

			}
			// if both outOfPlacees are filled then swap and reset
			if (outOfPlace1 != -1 && outOfPlace2 != -1) {
				int temp = 0;
				temp = arr[outOfPlace1];
				arr[outOfPlace1] = arr[outOfPlace2];
				arr[outOfPlace2] = temp;

				outOfPlace1 = outOfPlace2 = -1;

			}

		}

		return arr;
	}

	public boolean isElementOutOfPlace(int element, int index) {
		if (element > 0 && index % 2 == 1) {
			return true;
		}

		if (element < 0 && index % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, -2, -3, 2, -4, 5, 6, 7, -2, -3, 4 };

		AlternativePostiveNegative apn = new AlternativePostiveNegative();
		arr = apn.rearrange(arr);
		for (int item : arr)
			System.out.print(item + " ");

	}

}
