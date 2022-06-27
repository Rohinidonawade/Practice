package com.programPages;

import java.util.Scanner;

public class SwappingOfTwoNumber {

	public void getSwappingOfTwoNumbers(int intFirstValue, int intSecoundValue) {			
	
	System.out.println("Before Swapping numbers:" +intFirstValue+" "+intSecoundValue);
	
	intFirstValue=intFirstValue+intSecoundValue;
	intSecoundValue=intFirstValue-intSecoundValue;
	intFirstValue=intFirstValue-intSecoundValue;
		
	System.out.println("Afetr swapping of numbers :" +intFirstValue+" "+intFirstValue);
	}
}
