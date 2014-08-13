package com.franciszabala.exam2;

public class DivisibilityTester {
	
	private int numberToCheckIfDivisible;
	private int numberToUseForCheckingDivisibility;
	
	public int getNumberToCheckIfDivisible() {
		return numberToCheckIfDivisible;
	}

	public void setNumberToCheckIfDivisible(int numberToCheckIfDivisible) {
		this.numberToCheckIfDivisible = numberToCheckIfDivisible;
	}

	public int getNumberToUseForCheckingDivisibility() {
		return numberToUseForCheckingDivisibility;
	}

	public void setNumberToUseForCheckingDivisibility(
			int numberToUseForCheckingDivisibility) {
		this.numberToUseForCheckingDivisibility = numberToUseForCheckingDivisibility;
	}


	
	public DivisibilityTester(int numberToCheckIfDivisible, int numberToUseForCheckingDivisibility) {
		this.numberToCheckIfDivisible = numberToCheckIfDivisible;
		this.numberToUseForCheckingDivisibility = numberToUseForCheckingDivisibility;
	}
	
	public boolean isNumberDivisible() {
		
		int intTemp = getNumberToCheckIfDivisible();
		int intTempDiv = getNumberToUseForCheckingDivisibility();
		
		while (intTemp >= intTempDiv) {
			intTemp -= intTempDiv;
		};
	
		if (intTemp == 0) {
			return true;
		} else {
			return false;
		}
		
		
	}

}
