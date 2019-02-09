//https://practice.geeksforgeeks.org/problems/3-divisors/0/?track=interview-mathematical
import java.util.*;
import java.lang.*;
import java.io.*;
 
class threeDivisors {
    public static int isPrime(int number){
		for (int i=2;i*i<=number ;i++ ) {
			if(number%i==0)
				return 1;
		}
		return 0;
	}
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for (int i = 0; i<testCases ; i++ ) {
			int number = scan.nextInt(),count = 0;
			if(number<4){
				System.out.println(count);
				continue;
			}
			count = 1;
			for (int j = 3; j*j<=number; j = j+2) {
				if(isPrime(j) == 0)
					count++;
			}
			System.out.println(count);
		}
	}
	
 
}
