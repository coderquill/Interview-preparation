//https://practice.geeksforgeeks.org/problems/perfect-numbers/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class perfectNumber {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int j = 0; j<testCases; j++){
	        long number = scan.nextLong();
	        long sum = 0;
	        int limit = (int)Math.sqrt(number);
	        //System.out.println(limit);
	        for(long i = 2; i<=limit; i++){
	            if(number%i==0)
	                sum = sum + i + (number/i); 
	             
	        }
	        //System.out.println(sum);
	        sum = sum+1;
	        if(sum==number)
	            System.out.println("1");
	        else
	            System.out.println("0");
	    }
	}
}
