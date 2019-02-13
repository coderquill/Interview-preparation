//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0/?track=interview-arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class chocolateDistribution {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i=0; i<testCases; i++){
		    int totalArrayElements = scan.nextInt();
		    int array[] = new int[totalArrayElements];
		    
		    for(int j=0;j<totalArrayElements;j++)
		        array[j]=scan.nextInt();
		        
		    for(int j=0; j<totalArrayElements-1; j++){
		        for(int k = j+1; k<totalArrayElements; k++){
		            if(array[j]>array[k]){
		                int temp=array[j];
		                array[j]=array[k];
		                array[k]=temp;
		            }
		        }
		    }
		  /*  for(int k=0;k<totalArrayElements;k++){
		        System.out.print(array[k]+" ");
		    }*/
		    int m = scan.nextInt();
		    int first=0,last=m-1;
		    int difference = Integer.MAX_VALUE;
		    int value=0;
		    for(first=0;last<totalArrayElements;last++){
		       int sub=array[last]-array[first];
		       // System.out.println(array[last]+"-"+array[first]+"="+sub);
		       if(sub<difference){
		           difference=sub;
		           
		       }
		       first++;
		    }
		 System.out.println(difference);
		}
	}
}
