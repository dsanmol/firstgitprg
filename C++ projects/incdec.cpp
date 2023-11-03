#include<stdio.h>
#include<conio.h>
int main(){
    int a,b,c,d,x;
    a=5;
    b=7;
    c=12;
    d=15;
    x=++a + ++b + ++c + ++d;
    printf("\n The updated value of a=%d,b=%d,c=%d,d=%d",a,b,c,d);
    getch();
    return 0;
}