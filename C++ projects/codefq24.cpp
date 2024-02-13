#include<stdio.h>
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int mincapa(int n,vector<pair<int, int>>& stops){
    int capacity=0;
    int currentpasse=0;
    for(int i=0;i<n;i++){
        currentpasse-=stops[i].first;
        currentpasse+=stops[i].second;
        capacity=max(capacity,currentpasse);
    }
    return capacity;

}
int main(){
    int n,a,b;
    cin>>n;
    vector<pair<int, int>> stops(n);
    for(int i=0;i<=n;i++){
        cin>>stops[i].first>>stops[i].second;


    }
    cout<<mincapa(n,stops);
}