// Input : 4
// Output : -4  -3  -2  -1  0   1   2   3   4

#include<stdio.h>

void Display(int iNo)
{
   int iCnt = 0;

     if( iNo < 0)
   {
     iNo = -iNo;
   }
   
   for( iCnt = -iNo; iCnt <= iNo; iCnt++)   //2n 2 loop kadun eka loop madhe convert kel ahe  program 83 ani 84 same 
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