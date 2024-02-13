#include<vector>
#include<stdio.h>
#include<iostream>
using namespace std;
int main(){
    
    int n;
    cin>>n;
    
    int curMax = 0;
	for(int i = 0; i < n; i++) {
		int curAns; cin >> curAns;
		curMax = max(curMax, curAns);

    }
    puts(curMax>0 ?"hard" : "easy");

    
    
}