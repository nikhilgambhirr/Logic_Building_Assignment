#include<stdio.h>

int Factorial(int iNo)
{
  int iCnt = 0;
  int iFact = 1; // new varibale multiplication sathi gheava lagto
    for(iCnt = iNo; iCnt>=1;iCnt--)//
    {
        iFact= iFact * iCnt;
    }
         return iFact;
}
int main()
{
    int iValue =0;
    int iRet =0;
    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = Factorial(iValue);

    printf("Factorial of number is %d",iRet);

    return 0;

}
