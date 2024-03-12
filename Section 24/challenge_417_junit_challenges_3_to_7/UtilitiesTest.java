package challenge_417_junit_challenges_3_to_7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UtilitiesTest {

	private Utilities utils;

	@Before
	public void setup() {
		utils = new Utilities();
	}
	
	
	@Test
	public void testEveryNthChar() throws Exception {
		
		// Given - Start
		// Changed to @Before
		// Given - Stop

		// When - Start
		char[] output = utils.everyNthChar(new char[] { 'h', 'e', 'l', 'l', 'o' }, 2);
		// When - Stop

		// Then - Start
		assertArrayEquals(new char[] { 'e', 'l' }, output); // Joka toinen pitäisi olla
		// Then - Stop

	}

	@Test
	public void testEveryNthCharWhenLenghtMoreLenghtOfArray() throws Exception {
		// Given - Start
		// Changed to @Before
		// Given - Stop

		// When - Start
		char[] output2 = utils.everyNthChar(new char[] { 'h', 'e', 'l', 'l', 'o' }, 8);
		// When - Stop

		// Then - Start
		assertArrayEquals(new char[] { 'h', 'e', 'l', 'l', 'o' }, output2); // Joka 8 pitäisi olla
		// Then - Stop
	}

	@Test
	public void testRemovePairs() throws Exception {

		// Given - Start
		// Changed to @Before
		// Given - End

		// When - Start
		String result = utils.removePairs("ABCBDEEF");
		// When - End

		// Then - Start
		assertEquals("ABCBDEF", result); // Pairs next to each other should be removed
		// Then - End

	}

	@Test
	public void testRemovePairsWithNotNextToEachOther() throws Exception {

		// Given - Start
		// Changed to @Before
		// Given - End

		// When - Start
		String result = utils.removePairs("ABBCDEEF");
		// When - End

		// Then - Start
		assertEquals("ABCDEF", result); // Pairs next to each other should be removed
		// Then - End

	}

	@Test
	public void testRemovePairsWithNull() throws Exception {

		// Given - Start
		// Changed to @Before
		// Given - End

		// When - Start
		String result = utils.removePairs(null);
		// When - End

		// Then - Start
		assertNull("Did not get null returned when argument passed was null", result); // Pairs next to each other
																						// should be removed
		// Then - End

	}

	@Test
	public void testRemovePairsWithLessThan2() throws Exception {

		// Given - Start
		// Changed to @Before
		// Given - End

		// When - Start
		String result = utils.removePairs("A");
		// When - End

		// Then - Start
		assertEquals("A", result); // Pairs next to each other should be removed
		// Then - End

	}

	@Test
	public void testRemovePairsWithEmptyString() throws Exception {

		// Given - Start
		// Changed to @Before
		// Given - End

		// When - Start
		String result = utils.removePairs("");
		// When - End

		// Then - Start
		assertEquals("", result); // Pairs next to each other should be removed
		// Then - End

	}

	@Test
	public void testConverter() throws Exception {
		// Some crazy rules, like in some my past companies
		// Bussiness suka

		// Given - Start
		// Changed to @Before
		// Given - End

		// When - Start
		int result = utils.converter(10, 5);
		// When - End

		// Then - Start
		assertEquals(300, result);
		// Then - End
	}

	@Test(expected = ArithmeticException.class)
	public void testConverterDivideBy0() throws Exception {
		// Some crazy rules, like in some my past companies
		// Business suka

		// Given - Start
		// Changed to @Before
		// Given - End

		// When - Start
		int result = utils.converter(10, 0);
		// When - End

		// Then - Start
		assertEquals(300, result); // Does not matter, test in about exceptions. For being consistent
		// Then - End
	}

	@Test
	public void testNullIfOddLength() throws Exception {

		// Given - Start
		// Given - End

		// When - Start
		String result = utils.nullIfOddLength("evenLenght");
		String resultNonEven = utils.nullIfOddLength("nonEvenLenght");
		// When - End

		// Then - Start
		assertNotNull("String was ovenlenght", result); // Original String is returned when its even
		assertNull("String was odd lenght", resultNonEven);
		// Then - End

	}

}
