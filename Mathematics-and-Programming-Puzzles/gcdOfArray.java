//https://practice.geeksforgeeks.org/problems/gcd-of-array/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class gcdOfArray {
	
	    static int gcd(int a, int b) { 
            if (a == 0) 
                return b; 
            return gcd(b % a, a); 
        } 
 
        static int findGCD(int arr[], int n) { 
            int result = arr[0]; 
            for (int i = 1; i < n; i++) 
                result = gcd(arr[i], result); 
    
            return result; 
        }
        
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            int testCases = scan.nextInt();
            for(int i =0; i<testCases; i++ ){
                int sizeOfArray = scan.nextInt();
                int [] array = new int[sizeOfArray];
                for(int j = 0; j<sizeOfArray; j++){
                    array[j]=scan.nextInt();
                }
                int answer = findGCD(array,sizeOfArray);
                System.out.println(answer);
            }
	    }
}
