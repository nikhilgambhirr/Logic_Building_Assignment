#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef unsigned int UINT;

 UINT ToggleBit( UINT iNo , int pos )
{
   
   UINT iMaxsk = 1; 
   UINT iResult = 0;
   
   iMaxsk = iMaxsk << pos-1;
  
   iResult = iNo ^ iMaxsk;

   return iResult;

}

int main()
{
    UINT iValue = 0;
    int iRet = 0;
    int location = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    printf("Enter the Positin : \n");
    scanf("%d",&location);

    iRet = ToggleBit(iValue,location);

     printf("Updated the Number: %d\n",iRet);

    
    return 0;
}
    
