//https://practice.geeksforgeeks.org/problems/factorial/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class factorial {
    public static long factorialFunction (long number) {
        long factorial =1;
		if(number ==0 || number == 1)
		    return factorial;
		else
		    factorial = number * factorialFunction(number-1) ;
		return factorial;
		    
    }
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    long number = scan.nextLong();
		    long ans = factorialFunction(number);
		    System.out.println(ans);
		    
		}
	}
}
