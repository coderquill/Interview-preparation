//https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class gcd {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		
		for(int i = 0; i<testCases; i++){
		    int number1 = scan.nextInt();
		    int number2 = scan.nextInt();
		    int gcd = 1;
		    if(number1<number2){
		        int temp = number1;
		        number1 = number2;
		        number2 = temp;
		    }
		    
		    if(number1%number2==0)
		        gcd = number2;
		    else{
		        for( int j = 2; j<=number2; j++){
		            if(( number1%j==0) && (number2%j==0) )
		                gcd = j;
		        }
		    }
		    System.out.println(gcd);
		}
	}
}
