//https://practice.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n/0/?track=interview-mathematical

import java.util.*;
import java.lang.*;
import java.io.*;

class sumOfPrimes {
    
    
    
    static boolean[] prime(int max) {
        int m = max;
        
        boolean arr[] = new boolean[m+1]; 
        
        for(int i =0;i<=m;i++){
            arr[i] = true;
        }
        
        for(int i =2;i*i<=m;i++){
            
            if(arr[i]==true){
                
                for(int j = i*i;j<=m;j=j+i){
                    arr[j]=false;
                }
                
            }
        }
        return arr;
        
    }
    
    static void hashing( HashMap<Integer,Long> h , boolean[] prime, int[] sorted) {
        long sum =0;
        int  k = 2;
        for(int j = 0;j<sorted.length;j++){
         
            for(int i =k;i<=sorted[j];i++){
                if(prime[i]){
                    sum += i;
                }
              
            }
            
            h.put(sorted[j], sum);

            k=sorted[j]+1;
        }
    }
    
    
    
	public static void main (String[] args) throws IOException{
	    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		HashMap<Integer, Long> hm = new HashMap<>();
		int[] inputs = new int[i];
		int[] sorted= new int[i];
		int max = Integer.MIN_VALUE;
		
		for(int a = 0 ; a<i;a++){
		  int n = Integer.parseInt(br.readLine());
		  inputs[a] = n;
		  sorted[a]= n;
		  
		  if(n>max){
		      max=n;
		  }
		}
		
	    boolean[] p = prime(max);

        Arrays.sort(sorted);
	    
	    hashing(hm,p,sorted);
	    
	    StringBuffer sb = new StringBuffer();
	    
	    for(int l =0;l<i;l++){
	        sb.append(hm.get(inputs[l])+"\n");
	    }
	    System.out.println(sb);

	}
}
