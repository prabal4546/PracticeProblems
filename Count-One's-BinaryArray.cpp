#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends





// Function to count number of Ones
// arr: input array 
// N: size of input array
int countOnes(int arr[], int N)
{
    
    // Your code here
    int low=0;
    int high = N-1;
         if(arr[N-1]==1){
            return N;
        }
        if(arr[0]==0){
            return 0;
        }
    while(low<=high){
        int mid = (low+high)/2;

        if(arr[mid]==0){
           low = mid+1;
        }
   
        else{
            if(arr[mid-1]!=0||mid==0)
                return N-mid;
            else
                high=mid-1;
            
        }
    }
    return 0;
}


// { Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n;
        cin>>n;
        int *arr = new int[n]; 
        for(int i = 0; i < n; i++)
            cin>>arr[i];
        
        cout <<countOnes(arr, n)<<endl;
    }
    return 0;
}  // } Driver Code Ends