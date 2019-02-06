//https://practice.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class  IsSumofDigitsPallindrome{
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int testCases, number, sum;
		testCases = scan.nextInt();
		for(int i=0; i<testCases; i++){
		    number = scan.nextInt();
		    if(number == 1 || number == 10 || number == 100 || number == 1000 )
		        sum = 1;
		    else
		        sum = (number/1000) + (number/100) + ((number%100)/10) + ((number%100)%10);
		    if((sum/10) == (sum%10) || (sum/10) == 0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
