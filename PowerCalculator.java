package com.gradedproject.q2;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the base X: ");
        double base = in.nextDouble();
        System.out.print("Enter the power N: ");
        int power = in.nextInt();
        
        double result = calculatePower(base, power);
        
        System.out.println(base + " raised to the power of " +  power + " is: " + result);
    }
    
    public static double calculatePower(double base, int  power) {
    	if ( power == 0) {
            return 1;
        }
    	if ( power > 0) {
    		return base*calculatePower(base, power - 1);
            
        } else {
        	
            return 1/base*calculatePower(base, power - 1);
            
        }
    }
}
