package com.programPages;

public class ReversingString {

	
	
	public void reverseString() {
		
		String strValue = "Java Selenium";
		String strReverse =" ";
		
		System.out.println("Before Reverse :" +strValue);
		
		char charArray[] = strValue.toCharArray();
		for(int intCount = charArray.length-1; intCount>=0; intCount--) {
			strReverse+= charArray[intCount];	
		}
		System.out.println("After reversing:" +strReverse);
	}
	
}
