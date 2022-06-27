package com.programPages;

import java.util.HashSet;
import java.util.Set;

public class ArrayCommonElement {

	public void findCommonValueInStudentMarks() {
		
		int ar1[] = {1,10,20, 50,60};
		int ar2[] = {30, 29, 44, 60, 20};
		int ar3[] = {11, 28, 55,60,77};
		System.out.println("Common element");
		 
		int intMath=0, intScience=0, intSocialScience=0;
		
		while(intMath<ar1.length && intScience<ar2.length && intSocialScience<ar3.length) {
			if(ar1[intMath]==ar2[intScience] && ar2[intScience]==ar3[intSocialScience]) {
				System.out.println(ar1[intMath]+" ");
				intMath++;
				intScience++;
				intSocialScience++;				
			}
			
			else if(ar1[intMath]<ar2[intScience])
					intMath++;
			
			else if(ar2[intScience]<ar3[intSocialScience])
			         intScience++;
			
			else
			         intSocialScience++;
			
			
		}	
	}
	
}

