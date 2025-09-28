#include<stdio.h>
void DispalyDigits(int iNo)
{
int iDigit = 0;

 if( iNo < 0 )
 {
     iNo = -iNo;
 }
 while (iNo != 0)
 {
    iDigit = iNo % 10;
    printf("%d",iDigit);
      iNo = iNo / 10;

 }
 
}
 int main()
 {
    int iValue = 0;
     
    printf("Enter number");
    scanf("%d",&iValue);

    DispalyDigits(iValue);

    return 0;
 }