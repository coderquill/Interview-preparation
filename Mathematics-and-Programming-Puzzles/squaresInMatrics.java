//https://practice.geeksforgeeks.org/problems/squares-in-a-matrix/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class squaresInMatrics {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for( int j = 0; j<testCases; j++){
		    long m = scan.nextLong();
		    long n = scan.nextLong();
		    
		    if(n<m){
		        long temp = m;
		        m = n;
		        n = temp;
		    }
		    long answer = (m * (m + 1) *(2*m + 1)/6) + (n - m) * (m * ( m + 1)/2);
		        System.out.println(answer);
		}
		    
	}
	
}
