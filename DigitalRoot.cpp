// { Driver Code Starts
//Initial Template for C++


#include <iostream>
using namespace std;


 // } Driver Code Ends





//User function Template for C++

//Complete this function
int digitalRoot(int n)
{
    //Your code here
    if(n<10)
    {
        return n;
    }
    int temp = 0;
    temp = (digitalRoot(n/10) + n%10);
    if (temp>9)
    {
        return digitalRoot(temp/10) + temp%10;
    }
    else
    {
        return temp;
    }
}
