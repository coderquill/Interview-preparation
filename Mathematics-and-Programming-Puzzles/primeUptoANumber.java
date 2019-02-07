//https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class primeUptoANumber {
    public static void isPrime(int number){
        int flag = 1;
        for(int i = 2; i<number; i++){
            if(number%i==0){
                flag = 0;
                break;
            }
        }
        if(flag == 1)
            System.out.print(number+" ");

    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int i = 0; i<testCases; i++){
	        int endDigit = scan.nextInt();
	        for(int j = 2; j<=endDigit; j++){
	            isPrime(j);
	        }
	         System.out.println();
	    }
	    
	}
}
