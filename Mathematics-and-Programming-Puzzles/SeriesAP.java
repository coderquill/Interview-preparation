//https://practice.geeksforgeeks.org/problems/series-ap/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class SeriesAP {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t,first,second,n;
		t = scan.nextInt();
		for( int i = 0; i < t; i++){
		    first =  scan.nextInt();
		    second =  scan.nextInt();
		    n =  scan.nextInt();
		    int difference = second - first;
		    int ans = second + (difference*(n-2));
		    System.out.println(ans);
		}
	}
}
