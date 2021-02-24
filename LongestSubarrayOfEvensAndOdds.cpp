#include<iostream> 
using namespace std; 


 // } Driver Code Ends


//User function Template for C++

//Complete this function
int maxEvenOdd(int arr[], int n) 
{ 
   //Your code here
//   int count ;
//   int res = 1;
//   for(int i=0;i<n;i++)
//   {
//       count = 1;
       
//       for(int j=i+1;j<n;j++)
//       {
        //   if((arr[j-1]%2 == 0 && arr[j]%2 != 0) || (arr[j]%2 == 0 && arr[j-1]%2 != 0) )
//           {
//               count++;
//           }
//           else{
//               break;
//           }
//       }
//       res = max(res,count);
       
//   }
   
//   return res;
  int res = 1;
    int count = 1;
    for(int j=1;j<n;j++)
    {   if((arr[j-1]%2 == 0 && arr[j]%2 != 0) || (arr[j]%2 == 0 && arr[j-1]%2 != 0) )
            {
         count++;
         res = max(count,res);
    
            }
            else{count=1;}
    }
    return res;
} 

// { Driver Code Starts.



/* Driver program to test maxSubArraySum */
int main() 
{ 
    int testcases;
    //testcases
    cin>>testcases;
    while(testcases--)
    {
        int sizeOfArray;
        //size of array
        cin>>sizeOfArray;
        int arr[sizeOfArray];
        
        //inserting elements in the array
        for(int i=0;i<sizeOfArray;i++)
        {
            cin>>arr[i];
        }
        
        //calling function
        cout  << maxEvenOdd(arr, sizeOfArray)<<endl; 
    }
   return 0; 
} 
  // } Driver Code Ends