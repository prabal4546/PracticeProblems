#include<iostream>
using namespace std;
int peek(int arr[], int n){

    for(int i=0;i<n;i++){
        if (arr[0]>arr[1]){
            return arr[0];
        }
        if (arr[n-1]>arr[n-2]){
            return arr[n];
        }
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
            return arr[i];
            
        }
    }
}
int main(){
    int arr[5];
    int n;
    cin>>arr;
    peek(arr,5);
    return 0;
}