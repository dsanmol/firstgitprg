#include<stdio.h>
#include<iostream>
using namespace std;
int calc(int a,int b){
    int sol=0;
    while(b-->0){
        if(a%10==0){
            a=a/10;
            sol=a;
        }
        else{
            a=a-1;
            sol=a;
        }

    }
    return sol;

}
int main(){
    int n,k;
    cin>>n>>k;
    cout<<calc(n,k);
    
    
}