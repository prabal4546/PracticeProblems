// { Driver Code Starts
#include<bits/stdc++.h>

using namespace std;


 // } Driver Code Ends


   

// function to find the trapped water in between buildings
// arr: input array
// n: size of array
int trappingWater(int arr[], int n){

    // Your code here
    int lmax[n];
    lmax[n] = arr[n];
    for(int i = 1;i<n;i++)
    {
        lmax[i] = max(arr[i],lmax[i-1]); // 7 7 7 9
    }
    int rmax[n];
    rmax[n-1] = arr[n-1];
    for(int i=n-2;i>=0;i--)
    {
        rmax[i] = max(arr[i],rmax[i+1]); // 9 9 9 9
    }
    int res = 0;
    for(int i=1;i<n-1;i++)
    {
        res += (min(lmax[i],rmax[i]) - arr[i]); // 0+3+7
    }
    return res;
    /////////////////////////////////////
	int res = 0;

	for(int i = 1; i < n - 1; i++)
	{
		int res = 0;

    	int lMax[n];
    	int rMax[n];

    	lMax[0] = arr[0];
    	for(int i = 1; i < n; i++)
    		lMax[i] = max(arr[i], lMax[i - 1]);


    	rMax[n - 1] = arr[n - 1];
    	for(int i = n - 2; i >= 0; i--)
    		rMax[i] = max(arr[i], rMax[i + 1]);

    	for(int i = 1; i < n - 1; i++)
    		res = res + (min(lMax[i], rMax[i]) - arr[i]);
    	
    	return res;
	}

	return res;
}

// { Driver Code Starts.

int main(){
    
    int t;
    //testcases
    cin >> t;
    
    while(t--){
        int n;
        
        //size of array
        cin >> n;
        
        int a[n];
        
        //adding elements to the array
        for(int i =0;i<n;i++){
            cin >> a[i];            
        }
        
        //calling trappingWater() function
        cout << trappingWater(a, n) << endl;
        
    }
    
    return 0;
} 