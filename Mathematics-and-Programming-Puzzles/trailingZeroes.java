//https://practice.geeksforgeeks.org/problems/trailing-zeroes-in-factorial/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class trailingZeroes {
    /*public static double factorial(double number){
        if(number == 0 || number == 1)
            return 1;
        else
            return number*factorial(number-1);
    }*/
    public static int findTrailingZeros(int n) 
    { 
        // Initialize result 
        int count = 0; 
  
        // Keep dividing n by powers  
        // of 5 and update count 
        for (int i = 5; n / i >= 1; i *= 5) 
            count += n / i; 
  
        return count; 
    } 
    
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int k = 0; k<testCases; k++){
		      int number = scan.nextInt();
		      System.out.println(findTrailingZeros(number));
		}
	}
}
