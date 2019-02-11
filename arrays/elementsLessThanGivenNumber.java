//https://practice.geeksforgeeks.org/problems/count-of-smaller-elements/0/?track=interview-arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class elementsLessThanGivenNUmber {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int j = 0; j<testCases; j++){
	        int noOfElements = scan.nextInt();
	        int[] array =  new int [noOfElements];
	        for(int i = 0; i<noOfElements; i++){
	            array[i] = scan.nextInt();
	        }
	        int limit = scan.nextInt();
	        int count = 0;
	        for(int i =0 ; i<noOfElements; i++){
	            if(array[i]<=limit)
	                count++;
	        }
	        System.out.println(count);
	    }
	}
}
