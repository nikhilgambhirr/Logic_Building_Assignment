/////////////////////////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : fact + non factors cha difference kada
//   Author : Nikhil Kailas Gambhir
//   Date : 10/05/2025
/////////////////////////////////////////////////////////////////////
/*
Start
        Accept Number from user
            ek user kadun number ghya 
            tyachye factors kada ani
            tyache no factor ani factor madhala
            differecnce kada 
            
    stop
*/
#include<stdio.h>

int FactDiff(int iNo)
{
  int iCnt = 0;
  int sumFact = 0;
  int sumNonFact = 0;

    for(iCnt = 1; iCnt <iNo; iCnt++)
    {
        if(iNo % iCnt == 0)
        { 
        
         sumFact +=iCnt;    
             
        }
        else
        {
            sumNonFact += iCnt;
        }
    }
   return sumFact - sumNonFact;       
}


int main()
{
    int iValue =0;
    int iRet = 0;

    printf("Enter number:");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);

    printf("%d\n",iRet);
    return 0;

}
