#include<stdio.h>

void MultipleDisplay(int iNo)
{
  int iCnt = 0;

  for(iCnt =1; iCnt <=5; iCnt++)
{
    printf("%d \n",iCnt* iNo );
}

}
int main()
{
    int iValue =0;

    printf("Enter number:");
    scanf("%d",&iValue);

    MultipleDisplay(iValue);

    return 0;

}
