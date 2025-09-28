#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef unsigned int UINT;

 UINT ToggleBit( UINT iNo )
{
   
   UINT iMaxsk = 15; 
   UINT iResult = 0;
   

  // iMaxsk = ~iMaxsk;

   iResult = iNo ^ iMaxsk;

   return iResult;

}

int main()
{
    UINT iValue = 0;
    int iRet = 0;
    

    printf("Enter the number : \n");
    scanf("%d",&iValue);


    iRet = ToggleBit(iValue);

     printf("Updated the Number: %d\n",iRet);

    
    return 0;
}
    
