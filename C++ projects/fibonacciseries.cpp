#include<stdio.h>
#include<iostream>
#include<conio.h>
using namespace std;
int main(){
    int n1=0,n2=1,n3,i,number;
    cout<<"Enter Number of elements";
    cin>>number;
    cout<<n1,n2;
    for(i=2;i<number;++i){
        n3=n1+n2;
        cout<<n2;
        n1=n2;
        n2=n3;
    }
    getch();
    return 0;

 
}

