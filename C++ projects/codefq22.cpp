#include<stdio.h>
#include<iostream>
#include<string.h>

using namespace std;


int main(){
    string n;
    int acount=0;
    int bcount=0;
    int t=0;
    cin>>t;
    cin>>n;
    for(int i=0;i<t;i++){
        if(n[i]=='A'){
            acount++;

        }
        else if(n[i]=='D'){
            bcount++;
        }
    }
    if(acount>bcount){
        cout<<"Anton";
    }
    else if(bcount>acount){
        cout<<"Danik";
    }
    else if(acount==bcount){
        cout<<"Friendship";
    }
    
    
}