package challenge_416_junit_challenge_1_and_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilitiesTest {

	@Test
	public void testEveryNthChar() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemovePairs() {

		// Given - Start
		Utilities util = new Utilities();
		// Given - End

		// When - Start
		String result = util.removePairs("ABCBDEEF");
		// When - End

		// Then - Start
		assertEquals("ABCBDEF", result); // Pairs next to each other should be removed
		// Then - End

	}
	
	@Test
	public void testRemovePairsWithNotNextToEachOther() {

		// Given - Start
		Utilities util = new Utilities();
		// Given - End

		// When - Start
		String result = util.removePairs("ABBCDEEF");
		// When - End

		// Then - Start
		assertEquals("ABCDEF", result); // Pairs next to each other should be removed
		// Then - End

	}
	
	
	@Test
	public void testConverter() {
		fail("Not yet implemented");
	}

	@Test
	public void testNullIfOddLength() {
		fail("Not yet implemented");
	}

}
