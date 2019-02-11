//https://practice.geeksforgeeks.org/problems/second-largest/0/?track=interview-arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class secondLargest {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int k = 0; k<testCases; k++){
	        int noOfElements = scan.nextInt();
	        int[] array =  new int [noOfElements];
	        for(int i = 0; i<noOfElements; i++){
	            array[i] = scan.nextInt();
	        }
	        for(int i=0; i<noOfElements; i++){
	            for(int j = i+1; j<noOfElements; j++){
	                if(array[i]<array[j]){
	                    int temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }
	        System.out.println(array[1]);
	    }
	}
}
