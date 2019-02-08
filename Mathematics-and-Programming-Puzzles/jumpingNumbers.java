//https://practice.geeksforgeeks.org/problems/jumping-numbers/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class jumpingNumbers {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            for (int t = 0; t < testCases; t++) {
                int n = scanner.nextInt();
                solve(n);
            }
        }
    }

    private static void solve(int n) {
        LinkedList<Integer> queue = new LinkedList<>();
        System.out.print("0 ");
        
        for (int i = 1; i <= 9; i++) {
            
            queue.add(i);
            while (!queue.isEmpty()) {
                int temp = queue.remove();
                if (temp > n) 
                    continue;
                if(temp>9)
                    System.out.print(temp + " ");
                int leftMost = temp % 10;
                if (leftMost > 0) queue.add(temp * 10 + (leftMost - 1));
                if (leftMost < 9) queue.add(temp * 10 + (leftMost + 1));
            }
        }
        System.out.println();
    }
}
