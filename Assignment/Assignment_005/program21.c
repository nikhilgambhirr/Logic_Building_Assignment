//////////////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 10/05/2025
/////////////////////////////////////////////
/* 
start
       user kadun ek number ghya ani
       tya number jitke symbol print kara
       symbol:- $ and *
stop      
*/

#include<stdio.h>

void Pattern(int iNo)
{
    int iCnt = 0;

  for(iCnt = 0; iCnt < iNo; iCnt++)
  {
    printf("$ * \n");

  }
}
int main()
{
    int iValue = 0;
    printf("Enter number:");
    scanf("%d",&iValue);

    Pattern(iValue);
    
    return 0;
}