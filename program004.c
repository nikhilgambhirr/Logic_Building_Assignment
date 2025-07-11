// Input : 4
// Output : 1   2   3   4

#include<stdio.h>

void Display(int iNo)
{
   int iCnt = 0;

     if( iNo < 0)                // error
   {
     iNo = -iNo;
   }
   
   for( iCnt =iNo; iCnt >=1; iCnt++)
   {
    printf("%d\t",iCnt);
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