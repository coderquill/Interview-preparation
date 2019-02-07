//https://practice.geeksforgeeks.org/problems/pair-cube-count/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class pairCubeCount{
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int k = 0; k<testCases; k++){
		    int aCount = 0, bCount = 0;
		    double number = scan.nextInt();
		    //for(int i = )
		    //if(
		    int limit = (int)Math.cbrt(number);
		    for(int i = 1; i<=limit; i++){
		        for(int j = 0; j<=limit; j++){
		            if((i*i*i)+(j*j*j)==number){
		                aCount++;
		                bCount++;
		            }
		        }
		    }
		    System.out.println(aCount);//+" "+bCount);
		}
	}
}
