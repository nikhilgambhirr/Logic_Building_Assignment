//5th and 18th bit ON and OFF .

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int Bool;
typedef unsigned int UINT;

 Bool ChakBit( UINT iNo )
{
   
   UINT iMaxsk1 = 131088; 
   UINT iResult = 0;
   

   iResult = iNo & iMaxsk1;

    if( iResult == 0)
    {
        return FALSE;
    }
    else
    {
        return TRUE;
    }
    
}

int main()
{
    UINT iValue = 0;
    Bool bRet = FALSE;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    bRet = ChakBit(iValue);

    if(bRet == TRUE)
    {
      printf("5th and 18th  bit  is ON");

    }
    else
    {
      printf(" 5th and 18th bit  is OFF");

    } 
    
    return 0;
}
    
