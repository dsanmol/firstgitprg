#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int k,n,w,f=0,t;
    cin>>k>>n>>w;
    //t=w;
    for(int i=1;i<=w;i++){
        t=k*i;
        f+=t;
    }
    //f=f-1;
    //cout<<f<<endl;
    int d=(n-f);
    if(n>f){
        cout<<0;
    }
    if(f>n){
        d=(f-n);
        cout<<d;

    }
    
    if(d<=0){
        cout<<0;

    }
    
}