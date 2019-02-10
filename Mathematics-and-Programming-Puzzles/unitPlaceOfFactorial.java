//https://practice.geeksforgeeks.org/contest-problem/unit-digit/0/
import java.util.*;
import java.lang.*;
import java.io.*;

class unitPlaceOfFactorial {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    double number = scan.nextDouble();
		    if((int)number == 0 || number == 1){
		        System.out.println("1");
		    }
		    else if((int)number == 2){
		        System.out.println("2");
		    }
		    else if((int)number == 3){
		        System.out.println("6");
		    }
		    else if((int)number == 4){
		        System.out.println("4");
		    }
		    else
		        System.out.println("0");   
		}
	}
}
