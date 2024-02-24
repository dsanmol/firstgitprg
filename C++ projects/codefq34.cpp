#include<vector>
#include<iostream>
using namespace std;
int noofstuds(int n,vector<pair<int,int>> &rooms){
    int count=0;
    for(int j=0;j<n;j++){
        int p = rooms[j].first;
        int q = rooms[j].second;
        if(q-p>=2){
            count++;
        }
    }
    return count;

}
int main(){
    int n;
    cin>>n;
    vector<pair<int,int>> room(n);
    for(int i=0;i<n;i++){
        cin>>room[i].first>>room[i].second;
    }
    cout << noofstuds(n, room) << endl;
    return 0;

    

}