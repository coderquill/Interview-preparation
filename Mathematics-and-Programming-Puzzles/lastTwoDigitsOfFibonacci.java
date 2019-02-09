//https://practice.geeksforgeeks.org/problems/last-two-digits-of-fibonacci/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class lastTwoDigitsOfFibonacci {
    public static long[] fibonacciSeries() {
        long[] fibonacci = new long[300];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i < 300; i++) {
            fibonacci[i] =(fibonacci[i-1] + fibonacci[i-2])%100;
        }
    //System.out.println(Arrays.toString(fibo));
    return fibonacci;
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    long[] fibonacci = fibonacciSeries();
	    for(int j = 0; j<testCases; j++){
	        long number = scan.nextLong();
	        int pos = (int)(number % 300);
            System.out.println(fibonacci[pos]);
	    }
	}
}
