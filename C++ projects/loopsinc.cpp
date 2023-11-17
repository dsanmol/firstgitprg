#include<stdio.h>
#include<conio.h>
int main() {
    int number, factorial = 1;

    printf("Enter a number: ");
    scanf("%d", &number);

    if (number < 0) {
        printf("Factorial of a negative number is not defined.\n");
    } 
    else {
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        printf("Factorial of %d is: %d\n", number, factorial);
    }
    getch();

    return 0;
}