#include<stdio.h>
#include <iostream>
#include <conio.h>
using namespace std;
int main(){
    int a,b=1;
    cout<<"hello";
    cin>>a;
    for (int i = 1; i <= a; i++){
        b*=i;
    }
    //cout<<b;
    //cout<<"The factotial is%d",b;
    printf("The factorial is %d",b);
    getch();
    
}