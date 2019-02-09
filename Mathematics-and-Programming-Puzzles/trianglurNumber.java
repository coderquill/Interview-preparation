//https://practice.geeksforgeeks.org/problems/triangular-number/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class triangularNumber {
	public static void main (String[] args) {
		
	    Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int k = 0; k<testCases; k++){
		      int number = scan.nextInt();
		      
            double n = (Math.pow((1+8*number),0.5)-1)/2;
            int x  = (int)n;
            if(x==n)
                System.out.println("1");
            else
                System.out.println("0");
		}
	}
}
