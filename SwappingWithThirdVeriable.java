package com.programPages;

public class SwappingWithThirdVeriable {

	public void swappingOfNumbersWithThirdValue(int intFirstNumber, int intSecoundNumber) {
		int intThirdNumber;
		System.out.println("Before swapping FirstNumber:" +intFirstNumber);
		System.out.println("Before swapping SecoundNumber:" +intSecoundNumber);
		
        intThirdNumber = intFirstNumber;
        intFirstNumber = intSecoundNumber;
        intSecoundNumber= intThirdNumber;
        
		System.out.println("Before swapping FirstNumber:" +intFirstNumber);
		System.out.println("Before swapping SecoundNumber:" +intSecoundNumber);
		
	}
}
