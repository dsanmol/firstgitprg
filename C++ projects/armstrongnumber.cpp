#include<stdio.h>
#include<iostream>
#include<conio.h>
using namespace std;
int main(){
    int n,r,sum=0,temp;
    cout<<"Enter The Number";
    cin>>n;
    temp=n;
    while(n>0){
        r=n%10;
        sum=sum+(r*r*r);
        n=n/10;

    }
    if(temp==sum){
        cout<<"Armstrong number";
    }
    else{
        cout<<"Not an armstrong number";
    }
    getch();
    return 0;
}