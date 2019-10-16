package arraytests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import java.io.PrintStream;

import array.MissingNumber;

public class MissingNumberTest {

	private final PrintStream stdout = System.out;

	@Test
	public void helloWorldTest() {

		MissingNumber missingNumber = new MissingNumber();
		assertEquals("HelloWorld Test", "HelloWorld", missingNumber.respondHelloWorld());

	}

	@Test
	public void mockitohelloWorldTest() {
		MissingNumber missingNumber = Mockito.mock(MissingNumber.class);
		when(missingNumber.getHelloWorld()).thenReturn("HelloWorld");
		assertEquals("Mockito Test", "HelloWorld", missingNumber.getHelloWorld());
	}

	@Test
	public void findMissingNumberTest() {
		// MissingNumber missingNumber = Mockito.mock(MissingNumber.class);
		MissingNumber missingNumber = new MissingNumber();
		// when(missingNumber.getMissingNumber(new int[] { 2, 3, 4, 5 },
		// 5)).thenReturn(1);
		assertEquals("Missing number with array 5 elements", 1,
				missingNumber.getMissingNumber(new int[] { 2, 3, 4, 5 }, 5));
		assertEquals("Missing number with array 2 elements", 1, missingNumber.getMissingNumber(new int[] { 2 }, 2));
		assertEquals("Missing number with array 2 elements", 0, 
				missingNumber.getMissingNumber(new int[] {1,2}, 2));
		assertEquals("No missing number with array size of 8",0,
				missingNumber.getMissingNumber(new int[] {2,3,4,5,6,7,8,1}, 8));

	}

}
