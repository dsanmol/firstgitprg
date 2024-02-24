#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int t,n,s,absdiff=1;
    cin>>t;
    while(t--){
        cin>>n>>s;
        if(s>n){
            cout<<n-(s-n);
        }
        else if(n>=s){
            absdiff=s;
            cout<<absdiff<<endl;

        }
        
    }
}