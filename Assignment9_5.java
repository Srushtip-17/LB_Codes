////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : MulDigits
// Input :         integer
// Output :        integer
// Description :   write a program which accept number from user and return difference between summation of even digits and summation of odd digits.
// language :      Java
// Date :          29/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and return difference between summation of even digits and summation of odd digits
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    int CountDiff(int iNo)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iSumEven += iDigit;
            }
            else
            {
                iSumOdd += iDigit;
            }
            iNo = iNo / 10;
        }
        return iSumEven - iSumOdd;
    }
}

class Assignment9_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        int iRet = nobj.CountDiff(iValue);

        System.out.println("Difference between summation of even and odd digits: " + iRet);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 2395
/// Output : -15
/// 
/// Time Complexity : O(N) where N is the number of digits in the input number
/// 
///////////////////////////////////////////////////////////////////////////////////////////