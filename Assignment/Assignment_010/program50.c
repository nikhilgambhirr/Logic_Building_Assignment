#include<stdio.h>

int CountDiff(int iNo)
{
    int iDigit = 0;
    int evenSum = 0, oddSum = 0;
    
      if( iNo < 0)   //updeter
      {
        iNo = -iNo;
      }
     while (iNo != 0)
     {
         iDigit = iNo % 10;

         if(iDigit % 2 ==0)
         {
         evenSum += iDigit;
         }
         else
         {
            oddSum += iDigit;
         }
          iNo = iNo / 10;
     }
     
     return evenSum - oddSum;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:\n");
    scanf("%d",&iValue);

    iRet = CountDiff(iValue);

    printf("%d\n",iRet);

    return 0;
 }