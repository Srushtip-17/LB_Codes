////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

////////////////////////////////////////////////////////////////////////////////////////////
//  
//  Function name : Number
//  Input :         int
//  Output :        void
//  Description :   Accept single digit from user and print it in word
//  language :      C
//  Date :          27/05/2026
//  Author :        Srushti Nitin Pagar
//
////////////////////////////////////////////////////////////////////////////////////////////

void Number(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    if(iNo == 0)
    {
        printf("Zero");
    }
    else if(iNo == 1)
    {
        printf("One");
    }
    else if(iNo == 2)
    {
        printf("Two");
    }
    else if(iNo == 3)
    {
        printf("Three");
    }
    else if(iNo == 4)
    {
        printf("Four");
    }
    else if(iNo == 5)
    {
        printf("Five");
    }
    else if(iNo == 6)
    {
        printf("Six");
    }
    else if(iNo == 7)
    {
        printf("Seven");
    }
    else if(iNo == 8)
    {
        printf("Eight");
    }
    else if(iNo == 9)
    {
        printf("Nine");
    }
    else
    {
        printf("Please Enter Single Digit Number");
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Single Digit Number to print it in word : ");
    scanf("%d", &iValue);

    Number(iValue);

    return 0;
}
////////////////////////////////////////////////////////////////////////////////////////////
//
// Input : 9
// Output : Nine
//
//////////////////////////////////////////////////////////////////////////////////////////////