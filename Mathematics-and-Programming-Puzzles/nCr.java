//https://practice.geeksforgeeks.org/problems/ncr/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class nCr {
    /*public static long factorial(long number){
        
        if(number == 0 || number == 1)
            return 1;
        else
            return number*factorial(number-1);
    }
	public static void main (String[] args) {
    	Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    for(int i = 0; i<testCases; i++){
	        long n = scan.nextLong();
	        long r = scan.nextLong();
	        long answer = 0;
	        if(n>=r && n!=0 && r!=0){
	            if(n-r == 1|| r == 1)
	                answer = n;
	            else
	                answer = (factorial(n))/(factorial(n-r)*factorial(r));
	        }
	        System.out.println(answer);
	    }
	}
}*/
    //using dynamin programming
    public static void main (String[] args) {
    	Scanner scan = new Scanner(System.in);
	    int testCases = scan.nextInt();
	    int Comb[][] = new int[1001][1001];
		
		for(int i =0;i<1001;i++)
		    for(int j=0;j<=i;j++)
		    {
		        if(j==0 || j==i) Comb[i][j] = 1;
		        
		        else Comb[i][j] = Comb[i-1][j-1]%1000000007+ Comb[i-1][j]%1000000007;
		    }
	        for(int i = 0; i<testCases; i++){
	            int n = scan.nextInt();
	            int r = scan.nextInt();
                System.out.println(Comb[n][r]%1000000007);
	        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
