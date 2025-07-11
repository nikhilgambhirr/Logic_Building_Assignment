/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 8/05/2025
//
/////////////////////////////////////////////
#include<stdio.h>

typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL check(int iNo1)
{
      if(iNo1 % 5== 0)
      {
        return TRUE;
      }
      else
      {
      return FALSE;
      }
}
 int main()
 {
    int iValue = 0;
   BOOL bRet = FALSE;

   printf("Enter number: \n");
   scanf("%d",&iValue);

   bRet = check(iValue);

   if(bRet ==  TRUE)
   {
      printf("Divisible by 5\n");

   }
   else
   {
    printf("Not Divisible by 5\n");
   }
     return 0;
 }
