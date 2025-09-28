#include<stdio.h>

int ToggleBit(int iNo)
{
    int iMaxsk = 576;
    int iResult = 0;

    iResult = iNo ^ iMaxsk;

    return iResult;

    
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter the number : \n");
    scanf("%d",&iValue);

    iRet = ToggleBit(iValue);
    
    printf("Updated the number is : %d\n",iRet);


    
    return 0;
}
