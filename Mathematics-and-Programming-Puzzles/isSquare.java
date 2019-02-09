//https://practice.geeksforgeeks.org/problems/check-if-given-four-points-form-a-square/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class isSquare {
    public static class Point { 
        int x, y; 
    } 
    public static int length ( int x1, int y1, int x2, int y2){
        //return(((int)Math.sqrt( Math.pow(x2-x1,2) - Math.pow(y2-y1,2) )));
        double xlength = Math.pow(x2-x1,2);
        //System.out.println(Math.pow(y2-y1,2));
        double ylength = Math.pow(y2-y1,2);
        //System.out.println(xlength);
        //System.out.println(ylength);
        double answer = Math.sqrt(xlength+ylength);
        //System.out.println(answer);
        
        return((int)answer);
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int k = 0; k<testCases; k++){
            Point a = new Point(), b = new Point(), c = new Point(), d = new Point(); 
            a.x = scan.nextInt(); a.y = scan.nextInt();
            b.x = scan.nextInt(); b.y = scan.nextInt(); 
            c.x = scan.nextInt(); c.y = scan.nextInt();
            d.x = scan.nextInt(); d.y = scan.nextInt();
            //System.out.println(a.x);
            //System.out.println(a.y);
            //System.out.println(b.x);
            //System.out.println(b.y);
            //System.out.println(length(a.x,a.y,b.x,b.y));
            int arm1 = length(a.x,a.y,b.x,b.y);
            int arm2 = length(b.x,b.y,c.x,c.y);
            int arm3 = length(c.x,c.y,d.x,d.y);
            //System.out.println(arm1);
            //System.out.println(arm2);
            //System.out.println(arm3);
            if(length(a.x,a.y,d.x,d.y) == length(b.x,b.y,c.x,c.y) && 
                 arm1 == arm2 && arm3 == arm2)
                System.out.println("1");
            else
                System.out.println("0");
            
		}   
	}
}
