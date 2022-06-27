package com.programPages;

public class ArmstrongNumber {

 
	public void checkTheNumberIsArmstrongNumber(int intNum) {   
    int inttemp = intNum;
    int intValue = 0;

    while (intNum > 0) {

        int intArm = intNum % 10;
        intValue = (intValue) +(intArm* intArm* intArm);
        intNum = intNum / 10;
    }

    if (inttemp == intValue) {
        System.out.println("It is Armstrong");
    }
    else {
        System.out.println("No is Not Armstrong");
    }

   }
}
