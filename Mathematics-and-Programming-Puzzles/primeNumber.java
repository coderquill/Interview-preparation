//https://practice.geeksforgeeks.org/problems/prime-number/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class primeNumber {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    int number = scan.nextInt();
		    int flag = 0;
		    for(int j = 2; j<number; j++){
		        if(number%j==0){
		            flag = 0;
		            break;
		        }else{
		           flag = 1; 
		        }
		    }
		    if(flag == 1)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}
