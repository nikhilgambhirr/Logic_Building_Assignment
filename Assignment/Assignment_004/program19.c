////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : non factors addition
//   Author : Nikhil Kailas Gambhir
//   Date : 10/05/2025
///////////////////////////////////////////

#include<stdio.h>

int SumNonFact(int iNo)
{
  int iCnt = 0;
  int sum = 0;

    for(iCnt = 1; iCnt <iNo; iCnt++)
    {
        if(iNo % iCnt != 0)
        { 
        
         sum +=iCnt;    
             
        }
    }
   return sum;       
}


int main()
{
    int iValue =0;

    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = SumNonFact(iValue);

    printf("sum of Non-Factors Addtion is:%d\n",iRet);
    return 0;

}