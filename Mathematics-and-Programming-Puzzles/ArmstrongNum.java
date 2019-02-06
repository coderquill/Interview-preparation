//https://practice.geeksforgeeks.org/problems/armstrong-numbers/0/?track=interview-mathematical#ExpectOP
import java.util.*;
import java.lang.*;
import java.io.*;

class ArmstrongNum {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t,num;
		
		t = scan.nextInt();
		for( int i = 0; i < t; i++){
		    num = scan.nextInt();
		    if ( (Math.pow(num/100,3) + Math.pow((num%100)/10,3) + Math.pow(((num%100)%10),3)) == num){
		        System.out.println("Yes");
		    }
		    else
		        System.out.println("No");
		}
	}
}
