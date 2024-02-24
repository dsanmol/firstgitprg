#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int t,n,a,b,c;
    cin>>t;
    while(t--){
       cin>>n>>a>>b>>c;
        if(b>=n && a+c>=n){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
        
    }
}