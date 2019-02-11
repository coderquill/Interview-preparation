//https://practice.geeksforgeeks.org/problems/reverse-an-array/0/?track=interview-arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class reverseArray {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int j = 0; j<testCases; j++){
	        int noOfElements = scan.nextInt();
	        int[] array =  new int [noOfElements];
	        for(int i = 0; i<noOfElements; i++){
	            array[i] = scan.nextInt();
	        }
	        int limit = array.length;
	        for(int i = limit -1 ; i>=0; i--){
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	    }
	}
}
