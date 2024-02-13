#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int t,n,s;
    cin>>t;
    while(t-->0){
        cin>>n>>s;
        if(n>=s){
            cout<<s;
        }
        else{
            cout<<n-(s-n)<<endl;
        }

    }
}