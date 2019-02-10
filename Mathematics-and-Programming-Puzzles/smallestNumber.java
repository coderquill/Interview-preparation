//https://practice.geeksforgeeks.org/contest-problem/the-game-of-digits1904/0/

import java.util.*;
import java.lang.*;
import java.io.*;

class smallestNumber {
    static long findSmallestNumber(long n) { 
        
        if (n >= 0 && n <= 9) { 
            return n; 
        } 
  
       
        Stack<Long> digits = new Stack<>(); 
  
        for (long i = 9; i >= 2 && n > 1; i--) { 
            while (n % i == 0) { 
                digits.push(i); 
                n = n / i; 
            } 
        } 
  
        if (n != 1) { 
            return -1; 
        } 
  
        long k = 0; 
        while (!digits.empty()) { 
            k = k * 10 + digits.peek(); 
            digits.pop(); 
        } 
  
       
        return k; 
    } 
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases;i++){
		    long number = scan.nextLong();
		    System.out.println(findSmallestNumber(number));
		    
		}
	}
}
