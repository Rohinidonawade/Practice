package com.testProgramPages;

import com.programPages.ArmstrongNumber;
import com.programPages.ArrayCommonElement;
import com.programPages.PrimeNumber;
import com.programPages.SwappingWithThirdVeriable;

public class TestOfAllPrograms {

	public static void main(String[] args) {

		           //ArrayCommonElement
		ArrayCommonElement objArrayCommonElement = new ArrayCommonElement();
		objArrayCommonElement.findCommonValueInStudentMarks();   

		          //PrimeNumber
		PrimeNumber objPrimeNumber = new PrimeNumber();
		objPrimeNumber.getPrimeNumber();
		
		objPrimeNumber.factorialOfPrimeNumber();
		
		objPrimeNumber.removingOfSpaceInString();		
		
                  //ArmstrongNumber                 
		ArmstrongNumber objArmstrongNumber = new ArmstrongNumber();
		objArmstrongNumber.checkTheNumberIsArmstrongNumber(153);
		
	}

}
