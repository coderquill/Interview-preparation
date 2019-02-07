//https://practice.geeksforgeeks.org/problems/add-two-fractions/1/?track=interview-mathematical
{
import java.util.*;
class Fraction_Addition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			GfG g = new GfG();
			g.addFraction(a,b,c,d);
		T--;
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete this function*/

class fractionalAddition
{ 	public static int gcdCounter (int number1, int number2) {
        if(number1<number2){
            int temp = number1;
            number1 = number2; 
            number2 = temp ;
        }
        int gcd = 1;
        //System.out.println(number1);
        //System.out.println(number2);
        if(number1%number2==0)
            gcd = number2;
        else 
            for(int j = 2; j<=number2; j++){
                if(number1%j==0 && number2%j==0)
                    gcd = j;
            }
		    
		 return gcd;
    }
    void addFraction(int num1, int den1, int num2, int den2)
    {
        int numerator,denominator,gcd = 1;
        if(den1 == den2){
            numerator = (num1+num2);
            denominator = den1;
            //System.out.println(numerator+"/"+denominator);
        }else{
            numerator =  (num1*den2)+(num2*den1);
            denominator = (den1*den2);
            
            gcd  = gcdCounter(numerator,denominator);
            //System.out.println(gcd);
            numerator = numerator/gcd;
            denominator =  denominator/gcd;
        }
            
            System.out.println( numerator+"/"+(denominator) );
        
    }
}
