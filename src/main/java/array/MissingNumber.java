package array;

public class MissingNumber {

	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();
		missingNumber.getMissingNumber(new int[] { 2, 3, 4, 5 }, 5);
	}

	public String respondHelloWorld() {
		return "HelloWorld";
	}

	public Object getHelloWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * This method returns missing integer from an array of intergers if found else
	 * returns 0
	 */
	public int getMissingNumber(int[] intArray, int size) {
		int expectedSum = (size * (size + 1)) / 2;
		int actualSum = 0;
		
		if(intArray == null || intArray.length == 0)
			return 0;
		
		
		for (int i = 0; i < intArray.length; i++)
			actualSum = actualSum + intArray[i];

		int missingNumber = expectedSum - actualSum;

		return missingNumber;
	}

}
