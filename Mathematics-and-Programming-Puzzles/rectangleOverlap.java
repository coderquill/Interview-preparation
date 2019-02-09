//https://practice.geeksforgeeks.org/problems/overlapping-rectangles/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;


class rectangleOverlap{
    public static class Point { 
  
        int x, y; 
    } 
  

    public static  boolean doOverlap(Point l1, Point r1, Point l2, Point r2) { 
        
        if (l1.x > r2.x || l2.x > r1.x) { 
            return false; 
        } 
  
         
        if (l1.y < r2.y || l2.y < r1.y) { 
            return false; 
        } 
  
        return true; 
    } 
  
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int k = 0; k<testCases; k++){
            Point l1 = new Point(),r1 = new Point(),l2 = new Point(),r2 = new Point(); 
            l1.x = scan.nextInt(); l1.y = scan.nextInt();
            r1.x = scan.nextInt(); r1.y = scan.nextInt(); 
            l2.x = scan.nextInt(); l2.y = scan.nextInt();
            r2.x = scan.nextInt(); r2.y = scan.nextInt();
  
            if (doOverlap(l1, r1, l2, r2)) { 
                System.out.println("1"); 
            } else { 
                System.out.println("0"); 
            }
		}
    } 
	
	
}
