#include<stdio.h>

void oddDisplay(int iNo)
{
  int iCnt = 0;

  for(iCnt =1; iCnt <=iNo; iCnt += 2)
{
    printf("%d \n",iCnt);
}

}
int main()
{
    int iValue =0;
    printf("Enter number:");
    scanf("%d",&iValue);

    oddDisplay(iValue);

    return 0;

}