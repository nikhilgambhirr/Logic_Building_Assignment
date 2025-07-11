#include<stdio.h>

int MultiDigits(int iNo)
{
    int iDigit = 0;
    int iCount = 1;
    
    if( iNo < 0)
      {
        iNo = -iNo;
      }
     while( iNo != 0)
     {
         iDigit = iNo % 10;

        if(iDigit != 0) // 0 ignoer karnar
        {
            iCount *= iDigit;
        }
          iNo = iNo / 10;
     }
     
     return iCount;
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:\n");
    scanf("%d",&iValue);

    iRet = MultiDigits(iValue);
    printf("%d\n",iRet);

    return 0;
 }
