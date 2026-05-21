import java.util.*;

class Assignment1_1
{
    int Divide(int iNo1 , int iNo2)
    {
        int iAns = 0;

        if(iNo2 == 0)
        {
            return -1;
        }

        iAns = iNo1 / iNo2;

        return iAns;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number for Division : ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second Number for Division : ");
        int iValue2 = sobj.nextInt();

        int iRet = 0;

        Assignment1_1 aobj = new Assignment1_1();

        iRet = aobj.Divide(iValue1 , iValue2);

        System.out.println("Division is : " + iRet);

        sobj.close();
    }
}