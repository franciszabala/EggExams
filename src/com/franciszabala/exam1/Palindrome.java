package com.franciszabala.exam1;


public class Palindrome {

	private char[] orderedString;
	private char[] reverseString;
	
	
	public Palindrome(String stringToBeTested) {
		setOrderedString(stringToBeTested);
		setReverseString(reverseArrayOfChar(getOrderedStringArray()));
	}
	
	private char[] getOrderedStringArray() {
		return orderedString;
	}
	private void setOrderedString(char[] orderedString) {
		this.orderedString = orderedString;
	}
	
	public char[] getReverseStringArray() {
		return reverseString;
	}
	private void setReverseString(char[] reverseString) {
		this.reverseString = reverseString;
	}
	
	
	private void setOrderedString(String orderedText) {
		setOrderedString(orderedText.toCharArray());
	}
	
//	private void setReverseString(String reverseText) {
//		setReverseString(reverseText.toCharArray());
//	}
	
	public char[] reverseArrayOfChar(char[] arrayToReverse) {
		char[] reversedArray = new char[arrayToReverse.length];
		for (int i = 0, j = arrayToReverse.length-1; i < arrayToReverse.length; i++, j--) {
			reversedArray[i] = arrayToReverse[j];
		}
		return reversedArray;
	}
	
	
	public boolean isAPalindrome() {
		for (int i = 0; i < orderedString.length; i++) {
			if (reverseString[i] == orderedString[i]) {
			} else {
				return false;
			}
		}
		return true;
	}

	
	
	
}
