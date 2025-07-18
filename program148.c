//7th and 15th and 21th and 28th  bit ON and OFF .

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int Bool;
typedef unsigned int UINT;

 Bool ChakBit( UINT iNo )
{
   
   UINT iMaxsk =135282752; 
   UINT iResult = 0;
   

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

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    bRet = ChakBit(iValue);
    


    if(bRet == TRUE)
    {
      printf("7th, 15th,21th & 28th bit  is ON");

    }
    else
    {
      printf(" 7th, 15th,21th & 28th bit is OFF\n");

    } 
    
    return 0;
}
    
