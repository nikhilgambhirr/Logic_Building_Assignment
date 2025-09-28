#include<stdio.h>

int FactorialDiff(int iNo)
{

     int iCnt =0;
     int evenFact= 1, oddFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

     for(iCnt = 1; iCnt <= iNo; iCnt++)
     {
             if(iCnt % 2 == 0)
             {
                evenFact *= iCnt;
             } 
             else
             {
                 oddFact *= iCnt;
             }
     }
    return evenFact-oddFact;
}
int main()
{
    int iValue = 0, iRet =0;
     
     printf("enter number :");
     scanf("%d",&iValue);

     iRet = FactorialDiff(iValue);
     printf(" Factorial Difference is %d",iRet);

     return 0;

}