#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int d,l,r,n;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>d>>l>>r;
        if(d>=l&&d<=r){
            cout<<"Take second dose now"<<endl;
        }
        else if(d>=l&&d>=r){
            cout<<"Too Late"<<endl;
        }

        else if(d<=l&&d<=r){
            cout<<"Too Early"<<endl;
        }
        

    }
    

}