#include<stdio.h>\

typedef unsigned int UINT;

UINT TogglrBitRange(UINT iNo, int iStart,int iEnd)
{
     int iMask = 0;

    if(iStart < 1 || iEnd > 32 || iStart > iEnd)
    {
        printf("Ivalid Pssition \n");
        return iNo;
    }
    for(int i = iStart; i <= iEnd; i++)
    {
       
        iMask = iMask |1<< (i - 1);
      
    }
      iNo = iNo ^ iMask;

     return iNo;
}

int main()
{
    int iValue = 0, iRet = 0;
    int iLocation1 = 0, iLocation2 = 0;

    printf("Enter the Number\n");
    scanf("%d",&iValue);

    printf("Enter the position1\n");
    scanf("%d",&iLocation1);

    printf("Enter the position2\n");
    scanf("%d",&iLocation2);

    iRet = TogglrBitRange(iValue,iLocation1,iLocation2);

    printf("Modifird numbre :%d\n",iRet);

    return 0;
}
