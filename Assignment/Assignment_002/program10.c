/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 9/05/2025
//
///////////////////////////////////////////////
#include<stdio.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL chkEvent(int iNo)
{
    if(iNo % 2 == 0)
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

    printf("Enter numer:");
    scanf("%d",&iValue);

    bRet = chkEvent( iValue);

      if(bRet == TRUE)
      {
        printf(" This is even  Number\n");
      }
      else
      {
        printf("This is old Number \n");
      }

    return 0;
}