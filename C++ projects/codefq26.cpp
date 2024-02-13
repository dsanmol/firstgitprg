#include<stdio.h>
#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n,h;
    int sum=0;
    
    cin>>n>>h;
    vector<int> a(n);
    //cin>>h;
    for(int i=0;i<n;i++){
        cin>>a[i];

    }
    for(int j=0;j<n;j++){
        if(a[j]<=h){
            sum+=1;

        }
        else{
            sum+=2;
        }

    }
    cout<<sum;
}