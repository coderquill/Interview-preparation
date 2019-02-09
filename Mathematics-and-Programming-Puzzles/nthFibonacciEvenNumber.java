//https://practice.geeksforgeeks.org/problems/nth-even-fibonacci-number/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger; 

class nthFibonnacciEvenNumber{
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for( int j = 0; j<testCases; j++){
		    int number = scan.nextInt();
		     BigInteger first = new BigInteger("2");
	         BigInteger second = new BigInteger("8");
	         if(number == 1) {
	             System.out.println(first);
	         }else if(number == 2) {
	             System.out.println(second);
	             
	         }else{
	         BigInteger next = new BigInteger("-1");
    	         for(int i = 3; i<= number; i++) {
    	             next = first.add((second.multiply(BigInteger.valueOf(4))));
    	             first = second;
    	             second = next;
    	         }
    	         System.out.println(second.mod(BigInteger.valueOf(1000000007)));

	         }
		}
		    
	}
}
