//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends





//User function Template for C++

int median(int A[],int N)
{
    
    sort(A,A+N);
    if(N%2 != 0)
    {
        return A[N/2];
    }
    else
    {
        return (double)(A[(N - 1) / 2] + A[N / 2]) / 2.0; 
    }
    
    //your code here
    //If median is in fraction then convert it to integer and return
}

int mean(int A[],int N)
{
    //your code here
    double sum=0;
    for(int i=0;i<N;i++)
    {
        sum += A[i];
    }
      return (double)sum / (double)N;
}



// { Driver Code Starts.

int main()
{
    //testcase
    int T;
    cin>>T;
   
    //looping testcase
    while(T--)
    {
        //number of elements in array
        int N;
        cin>>N;
        int a[N];
        
        //inseting elements in the array
        for(int i=0;i<N;i++){
            cin>>a[i];
        }
        //calling mean() and median() functions
        cout<<mean(a,N)<<" "<<median(a,N)<<endl;
    }
    return 0;
}
  // } Driver Code Ends