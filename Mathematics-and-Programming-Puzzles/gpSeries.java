//https://practice.geeksforgeeks.org/problems/series-gp/0/?track=interview-mathematical
import java.util.*;
import java.lang.*;
import java.io.*;

class gpSeries {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    float number1 = scan.nextFloat();
		    float number2 = scan.nextFloat();
		    float term = scan.nextFloat();
		    float answer = number1 ;
		    float ratio = number2/number1;
		    for(int j = 0; j<term-1; j++){
		         answer = answer*ratio;
		    }
		    
		    //System.out.println(ratio);
		    System.out.println((int)Math.floor(answer));
		}
	}
}
