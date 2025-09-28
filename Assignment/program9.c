/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 9/05/2025
//
///////////////////////////////////////////////
#include<stdio.h>
 
void Display( int iNo, int iFrequency)
{
    int i =0;
    for(i = 0; i < iFrequency; i++)
    {
        printf("%d ", iNo);

       // printf("\n");
         
    }
     

}
 int main()
 {
    int iValue = 0;
    int iCount = 0;

    printf("Enter number:\n");
    scanf("%d", &iValue);

    printf("enter frequency:\n");
    scanf("%d", &iCount);

    Display(iValue , iCount);
    return 0;
 }