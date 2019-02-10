/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class greatestNumberFormed
 {
	static class Pair { 
  
        double min; 
        
        double max; 
    } 
  
    static Pair getMinMax(double arr[], int n) { 
        Pair minmax = new  Pair(); 
        int i; 
  
        /*If there is only one element then return it as min and max both*/
        if (n == 1) { 
            minmax.max = arr[0]; 
            minmax.min = arr[0]; 
            return minmax; 
        } 
  
        /* If there are more than one elements, then initialize min  
    and max*/
        if (arr[0] > arr[1]) { 
            minmax.max = arr[0]; 
            minmax.min = arr[1]; 
        } else { 
            minmax.max = arr[1]; 
            minmax.min = arr[0]; 
        } 
  
        for (i = 2; i < n; i++) { 
            if (arr[i] > minmax.max) { 
                minmax.max = arr[i]; 
            } else if (arr[i] > minmax.min && arr[i] < minmax.max) { 
                minmax.min = arr[i]; 
            } 
        } 
  
        return minmax; 
    }
    public static double isPrime(double number){
       double answer = 1;
        for(double i = 2; i<number; i++){
            if(number%i==0){
                answer = 0;
                break;
            }
        }
        return answer;
    }
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int testCases = scan.nextInt();
	for(int i = 0; i<testCases; i++){
		int limitOfArray = scan.nextInt();
		double[] array = new double[limitOfArray];
		double[] arrayOfRightElements = new double[limitOfArray];
           	int k = 0;
		for(int j = 0; j<limitOfArray; j++){
			array[j]=scan.nextLong();
		}
		for(int j = 0; j<limitOfArray; j++){
		    if(isPrime(array[j]) == 0 ){
			if(Math.sqrt(array[j])-(int)Math.sqrt(array[j])==0){
				if(isPrime(Math.sqrt(array[j])) == 1){
		            		arrayOfRightElements[k] = array[j];
			   		 k++;
				}
			}
	            }
		}
		
		for(int j = 0; j<k; j++){
		     System.out.println((int)arrayOfRightElements[j]);
		}
		/*double max = arrayOfRightElements[0];
		for(int j = 1; j<k; j++){
			if(arrayOfRightElements[j]>max)
				max = arrayOfRightElements[j];
		}
		//System.out.println((int)max);
		double secondMax = arrayOfRightElements[0];
		for(int j = 1; j<k; j++){
			if(arrayOfRightElements[j]>secondMax && arrayOfRightElements[j]<max)
				secondMax = arrayOfRightElements[j];
		}
		System.out.print((int)max);
		System.out.print((int)secondMax);*/
		Pair minmax = getMinMax(arrayOfRightElements, k); 
		System.out.print((int)minmax.max);
		System.out.print((int)minmax.min);
	}
   }
	
}
