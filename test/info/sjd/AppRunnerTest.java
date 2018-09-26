package info.sjd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppRunnerTest {

	@Test
	void testSumOfAllDigits1() {
		
		assertEquals(15, AppRunner.sumOfAllDigits1(12345));
		assertEquals(0, AppRunner.sumOfAllDigits1(0));
		assertEquals(25, AppRunner.sumOfAllDigits1(55555));

		
		assertNotNull(AppRunner.sumOfAllDigits1(12345));
		
		assertTrue(AppRunner.sumOfAllDigits1(12345) == 15);
	}

	@Test
	void testSumOfAllDigits2() {
		
		assertEquals(15, AppRunner.sumOfAllDigits2(12345));
		assertEquals(0, AppRunner.sumOfAllDigits2(0));
		assertEquals(25, AppRunner.sumOfAllDigits2(55555));

		
		assertNotNull(AppRunner.sumOfAllDigits2(12345));
		
		assertTrue(AppRunner.sumOfAllDigits2(12345) == 15);
	}
	
	@Test
	void testIsPalindrome() {
		
		assertEquals(false, AppRunner.isPalindrome(12345));
		assertEquals(true, AppRunner.isPalindrome(0));
		assertEquals(true, AppRunner.isPalindrome(55555));

		
		assertNotNull(AppRunner.isPalindrome(123456789));
		
		assertTrue(AppRunner.isPalindrome(54345));
	}
	
	
	
	
	@Test
	void testMaxPalindrome() {
		
		assertEquals(99000099, AppRunner.maxPalindrome(1000, 9999, 1000, 9999));
		
		
		assertNotNull(AppRunner.maxPalindrome(1000, 9999, 1000, 9999));
		
		assertTrue(AppRunner.maxPalindrome(1000, 9999, 1000, 9999) == 99000099);
	}
}
