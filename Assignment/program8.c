/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 9/05/2025
//
///////////////////////////////////////////////
#include<stdio.h>
 void Display(int iNo)
 {
    if(iNo < 10)
    {
        printf("Hello\n");
    }
    else
    {
        printf("Demo\n");
    }

 }
  int main()
  {

     int iValue = 0;
     printf("Enter number: ");
     scanf("%d",&iValue);

     Display(iValue);

     return 0;
  }