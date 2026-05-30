////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : CountRange
// Input :         integer
// Output :        integer
// Description :   write a program which accept number from user and return the count of digit in between 3 and 7
// language :      Java
// Date :          29/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and return the count of digit in between 3 and 7
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    int CountRange(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            if(iDigit > 3 && iDigit < 7)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class Assignment9_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        int iRet = nobj.CountRange(iValue);

        System.out.println("Count of digits in between 3 and 7: " + iRet);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 4521
/// Output : 2
/// 
/// Time Complexity : O(N) where N is the number of digits in the input number
/// 
///////////////////////////////////////////////////////////////////////////////////////////