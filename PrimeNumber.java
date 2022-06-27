package com.programPages;

import org.w3c.dom.css.Counter;

public class PrimeNumber {

	String primeNumbers = " ";
	public void getPrimeNumber() {
		
		int intValue =0, intNumber = 0 ;
		
		
		for(intValue =1; intValue<=100; intValue++) {
			
			int intCounter = 0;
			for(intNumber = intValue; intNumber>=1; intNumber--) {
		
		if(intValue%intNumber == 0)
			intCounter = intCounter+1;
			}
			
		if(intCounter==2)
			primeNumbers = primeNumbers+ intValue+" ";
		}
		
		System.out.println("The Prime numbers from 10 to 100 is : " +primeNumbers);
		}
	
         //Factorial
	public void factorialOfPrimeNumber() {
		
		int intValue, intFact =1;
		int intNumber =25;
		
		for (intValue=1; intValue<=intNumber; intValue++)
			intFact = intFact*intValue;
		
		System.out.println("Factorial" +intNumber+"is:" +intFact);
     }
	
	public void removingOfSpaceInString() {
		 
		String strFirstName = " Java";
		String strLastname = "Selenium ";
		String strFullName = strFirstName+" ".concat(strLastname);
		
		System.out.println("The Full name :" +strFullName);
	
		    //remove space
		System.out.println("The Full name :" +strFullName.trim());
		
		   //Split string
		String[] strArrOf = strFullName.split(" ");
		for(String strSplit : strArrOf )
			System.out.println(strSplit);
		
		   //to lowecase
		System.out.println("Lower case :" +strFullName.toLowerCase());	

	}
}