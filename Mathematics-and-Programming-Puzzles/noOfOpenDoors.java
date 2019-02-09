//https://practice.geeksforgeeks.org/problems/number-of-open-doors/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class noOfOpenDoors {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    double number = scan.nextDouble();
		    int answer = (int)Math.sqrt(number);
		    System.out.println(answer);
	    }
	}
}
