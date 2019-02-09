//https://practice.geeksforgeeks.org/problems/angle-between-hour-and-minute-hand/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class clockAngle {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int i = 0; i<testCases; i++){
		    double hour = scan.nextDouble();
		    double minute = scan.nextDouble();
		    minute = minute % 60;
            double angle;
            angle = Math.abs(0.5 * (60*hour - 11*minute));
            if(angle >= 360 - angle)
                angle = 360-angle;
            System.out.println((int)Math.floor(angle));
		}
		    
	}
}
