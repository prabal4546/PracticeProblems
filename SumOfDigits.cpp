
#include <iostream>
using namespace std;


 // } Driver Code Ends





//User function Template for C++

//Complete this function
int countDigits(int n)
{
   //Your code here
   int count=0;
   if(n<10)
        return 1;
    else{
        
        countDigits(n/10);
        if (n==0)
        {return count;}
        else{
        count++;}
        
        return count;
        
        
    }
    
}


// { Driver Code Starts.

int main() {
	int T;
	
	//taking testcases
	cin>>T;
	while(T--)
	{
	    int n;
	    
	    //taking number n
	    cin>>n;
	    
	    //calling countDigits
	    cout<<countDigits(n)<<endl;
	    
	    
	}
	return 0;
}


  // } Driver Code Ends