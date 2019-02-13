//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array/0/?track=interview-arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class removeDuplicates {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for( int t = 0; t<testCases; t++){
		    int[] inputArray = new int[100];
		    int[] countArray = new int[101];
		    int elementsInArray = scan.nextInt();
		    for(int i = 0; i<elementsInArray; i++){
		        inputArray[i] = scan.nextInt();
		    }
		    /*for(int i = 0; i<elementsInArray; i++){
		        System.out.print(inputArray[i]);
		    }*/
		    for(int i = 0; i<elementsInArray; i++){
		         //countArray[inputArray[i]]++;
		         if(countArray[inputArray[i]] == 0){
		            countArray[inputArray[i]] = 1;
		            System.out.print(inputArray[i]+" ");
		         }
		         
		    }
		    /*for(int i = 0; i<elementsInArray; i++){
		        if(countArray[inputArray[i]] = 0  ){
		            //System.out.print(inputArray[i]+"="+countArray[inputArray[i]]);
		        }
		    }*/
		    System.out.println();
		}
	}
}
