//https://practice.geeksforgeeks.org/problems/lcm-and-gcd/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class lcmAndGcd {
    public static int lcmCounter (int number1, int number2) {
        int int1 = number1, int2 = number2, ans = 1, lcm = 1;
        if(number1%number2==0)
		        lcm = number1;
		    else{
		        for( int j = 2; j<=number1; j++){
		          if(int1%j == 0 && int2%j == 0 ){
		              ans = ans *j;
		              int1 = int1/j;
		              int2 = int2/j;
		          }
		        }
		        ans = ans * int1 * int2;
		        lcm = ans;
		            
		    }
		    
		 return lcm;
    }
    public static int gcdCounter (int number1,int number2) {
        int gcd = 1;
        if(number1%number2==0)
		        gcd = number2;
		    else{
		        for( int j = 2; j<=number2; j++){
		            if(( number1%j==0) && (number2%j==0) )
		                gcd = j;
		        }
		    }
		return gcd;
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    int number1 = scan.nextInt();
		    int number2 = scan.nextInt();
		    int gcd = 1, lcm =1;
		    if(number1<number2){
		        int temp = number1;
		        number1 = number2;
		        number2 = temp;
		    }
		    lcm = lcmCounter(number1,number2);
		    gcd = gcdCounter(number1,number2);
		    
		    
		    System.out.println(lcm+" "+gcd);
		    
		    
		    
		}
	}
}
