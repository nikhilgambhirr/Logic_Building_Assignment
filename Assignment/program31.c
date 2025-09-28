#include<stdio.h>
void Dispaly(int iNo)
{   int iCnt = 0;
     
      if( iNo < 0)
      iNo = -iNo;

   
       for(iCnt = 0; iCnt < iNo; iCnt++)
    {
        printf("*\t");

    }
     for(iCnt = 0; iCnt < iNo; iCnt++)
    {
        printf("#\t");

    }
   

   
}

int main()
{
      int iValue = 0;

      printf("Enter number:");
      scanf("%d",&iValue);

      Dispaly(iValue);
      return 0;

}