//https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1/?track=interview-arrays
{

import java.util.*;
class  printingAlternateElement
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
             GfG gfg = new GfG();
             gfg.print(arr, n);
             System.out.println();
             
        }
    }
}
}


class GfG
{
    public static void print(int arr[], int n)
    {
        for(int i = 0; i<n; i=i+2)
            System.out.print(arr[i]+" ");
    }
}
