#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int Bool;
typedef unsigned int UINT;

Bool ChekBit( int iNo ,UINT ipos1, UINT ipos2 )
{
   UINT iMask1 = 1;
   UINT iMask2 = 1;
   UINT iResult1 = 0;
   UINT iResult2 = 0;


    iMask1 = iMask1 << (ipos1 - 1);
    iMask2 = iMask2 << (ipos2 - 1);  // using the left shift opetrtot
 
    iResult1 = iNo &iMask1; 
    iResult2 = iNo & iMask2;

    if(iResult1 == 0 && iResult2 == 0)
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
    UINT iValue = 0, bRet = 0, iLocation1 = 0, iLocation2 = 0;
    
   
      printf("Enter the number : \n");
      scanf("%d",&iValue);

     printf("Enter the possition : \n");
     scanf("%d",&iLocation1);

     printf("Enter the possition : \n");
     scanf("%d",&iLocation2);
     
     bRet = ChekBit(iValue,iLocation1,iLocation2);

    if(bRet == TRUE)
    {
      printf("Both bits are OFF\n");

    }
    else
    {
      printf("At least one bits is ON\n");

    } 
    
    return 0;
}   

    
