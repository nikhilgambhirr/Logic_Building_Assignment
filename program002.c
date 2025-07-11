/*
    input : 4
    utput : * * * *
   

    start
          Accept the frequency
          itrate from 1 to that frequency
*/

#include<stdio.h>

void Display(int iNo)
{
   int iCnt = 0;

     if( iNo < 0)
   {
     iNo = -iNo;
   }
   
   for( iCnt = 1;iCnt <= iNo; iCnt++)
   {
    printf("$\t");
   }
     printf("\n");
}

int main()
{

  int iValue = 0;

  printf("Enter the Frequency : \n");
  scanf("%d",&iValue);

  Display(iValue);

    return 0;


} // time complexity O(n)
// N is  a natural number
// Where N>= 0 and N<= Inifinty