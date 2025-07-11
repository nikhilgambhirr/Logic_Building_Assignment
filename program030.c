#include<stdio.h>

int CountDigits(int iNo)
{
    int iCnt = 0;
    int iDigits = 0;

    while(iNo != 0)
    {
        iDigits = iNo % 10;
        iNo = iNo / 10;
        iCnt++;
    }
    return iCnt;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = CountDigits(iValue);

    printf("Number of digits are : %d\n",iRet);

    return 0;
}