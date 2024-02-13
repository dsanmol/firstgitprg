#include<stdio.h>
#include<iostream>
#include<cctype>
using namespace std;
string wordcorrector(string s){
    int upperco=0;
    int lowerco=0;
    
    for(char c:s){
        if(isupper(c)){
            upperco++;
        }
        else{
            lowerco++;
        }
    }
    if(upperco>lowerco){
        string correctedWord = s;
        for(char& d:correctedWord){
            d=toupper(d);
        }
        return correctedWord;
    }
    else if(lowerco>upperco){
        string correctedWord = s;
        for(char& e:correctedWord){
            e=tolower(e);
        }
        return correctedWord;
    }
    else{
        string correctedWord = s;
        for(char& q:correctedWord){
            q=tolower(q);
        }
        return correctedWord;

    }
}
int main(){
    string a;
    cin>>a;
    cout<<wordcorrector(a);
    
}