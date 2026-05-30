////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

//////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name : CircleArea
// Input :         float
// Output :        double
// Description :   Write a program which accepts radius of circle from user and calculates its area. Consider value of PI as 3.14
// language :      Java
// Date :          29/05/2026
// Author :        Srushti Nitin Pagar
//
//////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////////////////
// 
// Write a program which accepts radius of circle from user and calculates its area. Consider value of PI as 3.14
//
///////////////////////////////////////////////////////////////////////////////////////////

class NumberX
{
    double CircleArea(float fRadius)    
    {
        double dArea;

        dArea = 3.14 * fRadius * fRadius;
        
        return dArea;
    }
}

class Assignment10_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fValue = 0.0f;
        double dRet = 0.0;

        System.out.println("Enter radius of circle : ");
        fValue = sobj.nextFloat();

        NumberX nobj = new NumberX();
        dRet = nobj.CircleArea(fValue);

        System.out.println("Area of circle is : " + dRet);

        sobj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//  
//  Input : 5.3  
//  Output : 88.2026
//
//  Time Complexity : O(1) as the area is calculated using a constant number of operations
//
///////////////////////////////////////////////////////////////////////////////////////////