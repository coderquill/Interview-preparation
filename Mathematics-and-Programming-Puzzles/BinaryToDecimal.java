//https://practice.geeksforgeeks.org/problems/binary-number-to-decimal-number/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class BinaryToDecimal {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases;
		testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    long binaryNumber = scan.nextLong();
		    String binaryString = String.valueOf(binaryNumber);
		    System.out.println(Integer.parseInt(binaryString,2));
		}
	}
}

