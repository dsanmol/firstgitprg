#include<unordered_set>
#include<iostream>
using namespace std;
bool is_dis_year(int year){
    string year_to_str=to_string(year);
    unordered_set<char> digits;
    for(char digit:year_to_str){
        if(digits.count(digit)){
            return false;
        }
        digits.insert(digit);
    }
    return true;


}
int distyear(int year){
    year++;
    while(!is_dis_year(year)){
        year++;
    }
    return year;
}
int main(){
    int year;
    cin>>year;
    int dist_year;
    dist_year=distyear(year);
    cout<<dist_year<<endl;
}