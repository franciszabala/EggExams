package com.franciszabala.exam1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void reverseTest() {
		//fail("Not yet implemented");
		Palindrome pal = new Palindrome("ABCD");
		
		char[] arrayToReverse = {'A', 'B', 'C', 'D'};
		
		char[] reversedArray = pal.reverseArrayOfChar(arrayToReverse);
		
		for (int i = 0, j = arrayToReverse.length-1; i < arrayToReverse.length; i++, j--) {
			assertEquals(arrayToReverse[j], reversedArray[i]);
		}

	}

	@Test
	public void isNotAPalindromeTest() {
		//fail("Not yet implemented");
		Palindrome pal = new Palindrome("RACECARA");
		assertFalse(pal.isAPalindrome());
	}
	
	@Test
	public void isAPalindromeTest() {
		//fail("Not yet implemented");
		Palindrome pal = new Palindrome("RACECARA");
		assertFalse(pal.isAPalindrome());
	}
	
}
