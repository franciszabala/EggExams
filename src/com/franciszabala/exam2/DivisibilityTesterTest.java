package com.franciszabala.exam2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibilityTesterTest {

	@Test
	public void isNumberDivisibleTest() {
		DivisibilityTester dt = new DivisibilityTester(9,3);
		assertTrue(dt.isNumberDivisible());
	}
	
	@Test
	public void isNotNumberDivisibleTest() {
		DivisibilityTester dt = new DivisibilityTester(7,3);
		assertFalse(dt.isNumberDivisible());
	}
	
	@Test
	public void isNumberDivisibleTestWithInteger4() {
		DivisibilityTester dt = new DivisibilityTester(12,4);
		assertTrue(dt.isNumberDivisible());
	}
	

}
