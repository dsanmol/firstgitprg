#include<stdio.h>
#include<conio.h>
int main(){
    int x,y,z,a;
    printf("Enter value of x:\n");
    scanf("%d",&x);
    printf("Enter value of y:\n");
    scanf("%d",&y);
    z=x<<2;
    a=y>>2;
    printf("The updated value of x is %d",z);
    printf("\nThe updated value of y is %d",a);
    getch();
    return 0;

}