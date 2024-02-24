#include <iostream>
using namespace std;
#include<vector>
int main() {
    int t, n,j;
    cin >> t;
    while (t--) {
        cin >> n;
        vector<int> v(n);
        for(auto &j:v) cin>>j;
        if(n==1){
            cout<<"YES"<<endl;
        }
        if(n==2){
            if(v[0]<v[1]){
                cout<<"YES"<<endl;
            }
            else if(v[0]==v[1]){
                cout<<"YES"<<endl;
            }
            else{
                cout<<"NO"<<endl;
            }
        }
        if(n==3){
            if(v[1]<min(v[2],v[0]) || v[1]>max(v[2],v[0])){
                cout<<"NO"<<endl;
            }
            else{
                cout<<"YES"<<endl;
            }
        }
        if(n>=4){
            cout<<"YES"<<endl;
        }
        
    }
    return 0;
}
