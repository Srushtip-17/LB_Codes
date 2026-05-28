////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : OddFactorial
// Input :         integer
// Output :        int
// Description :   Write a program which returns difference between even and odd factorial of given number.
// language :      Java
// Date :          27/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// Write a program which returns difference between even and odd factorial of given number.
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    int FactorialDiff(int iNo)
    {
        int iEvenFactorial = 1;
        int iOddFactorial = 1;
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <= iNo ; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenFactorial = iEvenFactorial * iCnt;
            }
            else
            {
                iOddFactorial = iOddFactorial * iCnt;
            }       
        }

        return iEvenFactorial - iOddFactorial;
    }
}

class Assignment7_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        iRet = nobj.FactorialDiff(iValue);

        System.out.println("Difference between even and odd factorial is : " +iRet);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 5
/// Output : 7
/// 
///////////////////////////////////////////////////////////////////////////////////////////