//https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array/0/?track=interview-arrays

import java.util.*;
import java.lang.*;
import java.io.*;

class minMax {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-- > 0) {
            int number = scan.nextInt();
            long[] array = new long[number];
            for(int i = 0; i < number; i++) {
                array[i] = scan.nextInt();
            }
            findMM(number, array);
        }
    }
    public static void findMM(int number, long[] array) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i = 0; i < number; i++) {
            if(min > array[i]) {
                min = array[i];
            }
            if(max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(min +" " +max);
    }
}
