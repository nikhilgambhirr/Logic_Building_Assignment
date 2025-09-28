#include<stdio.h>

int OddFactorical(int iNo)
{

     int iCnt =0;
     int iFact= 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }
     for(iCnt = iNo; iCnt>= 1;iCnt--)
     {
             if(iCnt % 2 != 0)
             {
                iFact *= iCnt;
             } 
     }
    return iFact; 
}
     int main()
{
     int iValue = 0, iRet =0;
     
     printf("enter number :");
     scanf("%d",&iValue);

     iRet = OddFactorical(iValue);
     printf("Odd Factorical of number is %d",iRet);

     return 0;

}