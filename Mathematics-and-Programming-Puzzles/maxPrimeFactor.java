//https://practice.geeksforgeeks.org/problems/largest-prime-factor/0/?track=interview-mathematical
import java.util.*;
import java.lang.*;
import java.io.*;

class maxPrimeFactor {
    public static long checkPrime(long n)
    {
        long Prime=0;
        while(n%2==0)
        {
            Prime=2;
            n>>=1;
        }
        
        for(int i=3;i*i<=n;i+=2)
        {
            while(n%i==0)
            {
                Prime=i;
                n=n/i;
            }
        }
        
        if(n>2)
        {
            Prime=n;
        }
        return Prime;
        
    }
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0)
		{
		    long n=sc.nextLong();
		    System.out.println(checkPrime(n));
		}
	}
}
