package arraytests;

import org.junit.Test;

import array.CheckInteger;
import junit.framework.Assert;

public class CheckInetgerTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void checkIntegerTest() {
		CheckInteger checkInteger = new CheckInteger();
		int[] arr = {5,6,8,10,25};
		int n = 10;
		int n1 = 20;
		
		Assert.assertEquals("Verify a given integer is present in an array given that the array contains the integer",
				true, checkInteger.verifyIntegerPresent(arr, n));
		Assert.assertEquals("Verify a givent integer is present in an array given that the array does not contain the integer",
				false, checkInteger.verifyIntegerPresent(arr, n1));
		
		
	}
	
	@Test
	public void checkIntegerBinarySearchTest() {
		CheckInteger checkInteger = new CheckInteger();
		int[] arr = {5,4,8,2,3};
		int n = 2;
		int n1 = 10;
		/*Assert.assertEquals("Verify a given integer is present in an array given that the array contains the element",
				true,checkInteger.verifyIntegerPresentWithBinarySearch(arr, n));*/
		
		Assert.assertEquals("Verify a given integer is present in an array given that the array contains the element",
				false,checkInteger.verifyIntegerPresentWithBinarySearch(arr, n1));
	}

}
