//https://practice.geeksforgeeks.org/problems/count-squares/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class countingSquares {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for( int i = 0; i<testCases; i++){
		    double number = scan.nextLong();
		    double count = Math.sqrt(number);
		    //System.out.println(count);
		    if((double)((int)count*(int)count)==number)
		        System.out.println((int)count-1);
		    else
		        System.out.println((int)count);
		}
		    
	}
}
