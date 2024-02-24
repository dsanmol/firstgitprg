#include<stdio.h>

#include<iostream>
using namespace std;
int main(){
    int t,n;
    
    cin>>t;
    
    
    while(t--){
        cin>>n;
        int a1,a2,a3;
        a1=a2=a3=1;
        while(a1+a2+a3!=n){
            if(a1<26){
                a1++;
            }
            else if(a2<26){
                a2++;
            }
            else if(a3<26){
                a3++;
            }
        }
        //cout<<a1<<a2<<a3;
        char a=(char)a1+'a'-1;//+'a'-1;
        char b=(char)a2+'a'-1;//+'a'-1;
        char c=(char)a3+'a'-1;//+'a'-1;
        cout<<c<<b<<a<<endl;


    }
    
}