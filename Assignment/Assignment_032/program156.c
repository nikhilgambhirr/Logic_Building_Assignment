#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int Bool;
typedef unsigned int UINT;

 Bool ChakBit( UINT iNo , int pos )
{
   
   UINT iMaxsk = 1; 
   UINT iResult = 0;
   
   iMaxsk = iMaxsk << pos-1;
   iResult = iNo & iMaxsk;

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
    int location = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    printf("Enter the Positin : \n");
    scanf("%d",&location);

    bRet = ChakBit(iValue,location);
    


    if(bRet == TRUE)
    {
      printf("Bit is On at position",location);

    }
    else
    {
      printf("Bit is OFF at Position",location);

    } 
    
    return 0;
}
    
