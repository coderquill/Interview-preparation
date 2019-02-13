//https://practice.geeksforgeeks.org/problems/operating-an-array/1/?track=interview-arrays

{
import java.util.Arrays;
import java.util.Scanner;
class Operating{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[10000];
			Arrays.fill(a,-1);
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			int yi = sc.nextInt();
			int z = sc.nextInt();
			GfG g = new GfG();
			boolean b = g.searchEle(a,x);
			if(b==true)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			b = g.insertEle(a,y,yi);
			if(b){
			if(a[yi]==y)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			}
			else
				System.out.print("0 ");
			b = g.deleteEle(a,z);
			if(b){
			if(!g.searchEle(a,z))
				System.out.println("1 ");
			else
				System.out.println("0 ");
			}
			else
				System.out.println("0 ");
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function(s) below*/
class addDeleteSearch
{		
	
      
	static int search(int[] a,int x){
        for(int i=0;i<a.length;i++){
		        if(a[i]==x)
		            return i;
		}
		return 0;
    }
	public boolean searchEle(int a[],int x)
       {
		//add code here.
		for(int i=0;i<a.length;i++){
		        if(a[i]==x)
		            return true;
		}
		return false;
	}
	public boolean insertEle(int a[],int y,int yi)
        {
              //add code here.
              if(yi<a.length){
                a[yi]=y;
                return true;
              }
            else
            return false;
              
	}
	public boolean deleteEle(int a[],int z)
        {
		//add code here.
		if(searchEle(a,z)){
		    int pos=search(a,z);
		    for(int i=pos;i<a.length-1;i++)
		        a[i]=a[i+1];
		    return true;
		}
		return true;
	}
}
