
////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : non factors
//   Author : Nikhil Kailas Gambhir
//   Date : 10/05/2025
///////////////////////////////////////////

#include<stdio.h>

void NonFact(int iNo)
{
  int iCnt = 0;
  int First =1;

    for(iCnt = 1; iCnt <iNo; iCnt++)
    {
        if(iNo % iCnt != 0)
        { 
        
        
            printf("%d\n", iCnt);
            
             
        }
    }
        
}


int main()
{
    int iValue =0;

    printf("Enter number:");
    scanf("%d",&iValue);

    NonFact(iValue);
    return 0;

}