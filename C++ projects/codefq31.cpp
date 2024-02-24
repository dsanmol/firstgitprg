#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    int t,x,n,s,r,ans;
    cin>>t;
    
    while(t--){
        cin>>n>>x;
        ans=0;
        for(int i=0;i<n;i++){
            cin>>s>>r;
            if(s<=x && r>ans){
                ans=r;
            }
        }
        cout<<ans<<endl;

    }
}