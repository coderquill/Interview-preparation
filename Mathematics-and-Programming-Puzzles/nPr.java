//https://practice.geeksforgeeks.org/problems/npr/0/?track=interview-mathematical
import java.util.*;
import java.lang.*;
import java.io.*;

class nPr {
    public static long factorial(long n) {
        if(n==0 || n == 1)
            return 1;
        else
            return (n * factorial(n-1));
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases;
		testCases = scan.nextInt(); 
		int n,r;
		for(int i=0; i<testCases; i++){
		   n = scan.nextInt(); 
		   r = scan.nextInt();
		   long answer = 0;
		   
		   if(n-r == 1)
		        answer = factorial(n);
		   else{
		       long fact1 = factorial(n);
		       
		       long fact2 = factorial((n-r));
		       
		       answer = (fact1/fact2);
		   }
		   System.out.println(answer);
		}
	}
}
