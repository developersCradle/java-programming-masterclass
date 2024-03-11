package challenge_417_junit_challenges_3_to_7;

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
	public void testRemovePairsWithNull() {

		// Given - Start
		Utilities util = new Utilities();
		// Given - End

		// When - Start
		String result = util.removePairs(null);
		// When - End

		// Then - Start
		assertNull("Did not get null returned when argument passed was null", result); // Pairs next to each other should be removed
		// Then - End

	}

	
	
	@Test
	public void testRemovePairsWithLessThan2() {

		// Given - Start
		Utilities util = new Utilities();
		// Given - End

		// When - Start
		String result = util.removePairs("A");
		// When - End

		// Then - Start
		assertEquals("A", result); // Pairs next to each other should be removed
		// Then - End

	}

	
	@Test
	public void testRemovePairsWithEmptyString() {

		// Given - Start
		Utilities util = new Utilities();
		// Given - End

		// When - Start
		String result = util.removePairs("");
		// When - End

		// Then - Start
		assertEquals("", result); // Pairs next to each other should be removed
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
