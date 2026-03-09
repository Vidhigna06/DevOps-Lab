#include<stdio.h>

int main()
{
    int num = 1234, sum = 0, digit;

    while(num != 0)
    {
        digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    }

    printf("Sum of digits = %d", sum);

    return 0;
}
