//https://practice.geeksforgeeks.org/problems/reverse-digit/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class reverseNumber {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for( int i = 0; i<testCases; i++){
		    long number = scan.nextLong();
		    long number1 = number;
		    long noOfDigits= 0;
		    while(number1!=0){
		        number1=number1/10;
		        noOfDigits++;
		        
		    }
		    long sum = 0;
		    while(noOfDigits!=0){
		        long digit = number%10;
		        long multiple = 1;
		        for(int k=0; k<noOfDigits-1; k++){
		              multiple = multiple *10;
		              
		        }
		        sum = sum + (digit*multiple);
		        noOfDigits--;
		        number=number/10;
	 
		    }
		    
		    System.out.println(sum);
	
		}
	}
}
