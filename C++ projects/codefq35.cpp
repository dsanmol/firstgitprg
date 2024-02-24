#include<math.h>
#include<iostream>
using namespace std;
int main(){
    int t,n;
    cin>>t;
    while(t--){
        cin>>n;
        cout<<ceil(n/2.0)<<" "<<ceil(n/3.0)<<endl;
    }
}