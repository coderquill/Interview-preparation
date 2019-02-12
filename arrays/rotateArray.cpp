#include <iostream>
using namespace std;
#define MAX 100
int dp[MAX];
int count_triplets (int arr[MAX],int n,int i,int ln,int p,int op)
{
    int op1=0,op2=0;
    if(ln>3)
    return 0;
    if(op==p&&ln==3)
    return 1;
    if(i==n)
    return 0;
    if(dp[i]!=-1)
    return dp[i];
    
    op1=count_triplets(arr,n,i+1,ln+1,p,op*arr[i]);
    op2=count_triplets(arr,n,i+1,ln,p,op);
    dp[i]= op1+op2;
}

int main() {

int tc,i,n,arr[MAX],p,j;

cin>>tc;
while(tc-->0)
{
    cin>>n;
    
    for(i=0;i<n;i++)
        cin>>arr[i];
        
        for(i=0;i<100;i++)
            dp[i]=-1;
        
        
cin>>p;    
    cout<<count_triplets(arr,n,0,0,p,1)<<endl;
    
}
	return 0;
}
