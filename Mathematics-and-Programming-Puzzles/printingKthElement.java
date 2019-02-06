//https://practice.geeksforgeeks.org/problems/print-the-kth-digit/0/?track=interview-mathematical
import java.util.*;
import java.lang.*;
import java.io.*;

class printingKthDigit {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    int base = scan.nextInt();
		    int power = scan.nextInt();
		    int k = scan.nextInt();
		    long digit = 0;
		    long number = (long)Math.pow(base,power);
		    for( int j =0; j<k; j++){
		        digit = number%10;
		        number = number/10;
		    }
		    System.out.println(digit);
		}
	}
}
