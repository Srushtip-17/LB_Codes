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
// Description :   write a program which accept number from user and return multiplication of all digits 
// language :      Java
// Date :          29/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and return multiplication of all digits
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    int MulDigits(int iNo)
    {
        int iDigit = 0;
        int iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iProduct = iProduct * iDigit;
            iNo = iNo / 10;
        }
        return iProduct;
    }
}

class Assignment9_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        int iRet = nobj.MulDigits(iValue);

        System.out.println("Multiplication of all digits: " + iRet);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 4521
/// Output : 40
/// 
/// Time Complexity : O(N) where N is the number of digits in the input number
/// 
///////////////////////////////////////////////////////////////////////////////////////////