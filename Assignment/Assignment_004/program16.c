////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : Multiplication of factors
//   Author : Nikhil Kailas Gambhir
//   Date : 15/05/2025
/////////////////////////////////////////////
#include<stdio.h>

int MultiFact(int iNo)  // multiplication of factor
{
     int iCet = 1;
    

    /* if(iNo <= 0)
      {
        return 0;
      } */

    for( int iCnt = 1; iCnt <= iNo/2; iCnt++)  
    {
        if((iNo % iCnt) == 0)
        {
            iCet = iCet* iCnt;
        }
        
    }
    return iCet;
}

  int main()
  {
    int iValue = 0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);
    
    iRet = MultiFact(iValue);

    printf("%d",iRet);
    return 0;
  }