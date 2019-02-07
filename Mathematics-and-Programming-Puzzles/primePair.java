//https://practice.geeksforgeeks.org/problems/pairs-of-prime-number/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class primePair {
    //if prime, return 1;
    public static int isPrime(int number){
        int flag = 1;
        for(int i = 2; i<number; i++){
            if(number%i==0){
                flag = 0;
                break;
            }
        }
        //if(flag == 1)
            return flag;
        
            
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    int number = scan.nextInt();
		    int flag = -1;
		    int k = 0;
		    int[] arrayOfPrimeNumbers = new int [number];
		    for(int j = 2; j<=number; j++){
		        flag = isPrime(j);
		        if(flag == 1){
		            //System.out.println(j);
		            arrayOfPrimeNumbers[k]=j;
		            k++;
		        }   
		    }
		    for (int l = 0; l<k; l++){
		        for(int m = 0; m<k; m++){
		            if(arrayOfPrimeNumbers[l]*arrayOfPrimeNumbers[m]<=number)
	                System.out.print(arrayOfPrimeNumbers[l]+" "+arrayOfPrimeNumbers[m]+" ");
		        }
	        }
		    System.out.println();
		}
	}
}
