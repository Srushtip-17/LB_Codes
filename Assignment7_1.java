////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// class name :    NumberX
// Function name : Display
// Input :         integer
// Output :        void
// Description :   write a program which accept number from user and display below pattern.
//                  5 - * * * * * # # # # #
// language :      Java
// Date :          27/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

/// //////////////////////////////////////////////////////////////////////////////////////////
/// 
// write a program which accept number from user and display summation of non-factors on screen.
//
///////////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1 ; iCnt <=iNo ; iCnt++)
        {
            System.out.println(" * ");
        }
        for(iCnt = 1 ; iCnt <=iNo ; iCnt++)
        {
            System.out.println(" # ");
        }
    }
}

class Assignment7_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        nobj.Display(iValue);

        sobj.close();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////
/// 
/// Input : 5
/// Output : * * * * * # # # # #
/// 
///////////////////////////////////////////////////////////////////////////////////////////