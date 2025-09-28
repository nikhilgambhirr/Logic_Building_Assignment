/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 09/05/2025
//
///////////////////////////////////////////////
#include<stdio.h>

void Display(int iNo)
{
    //Write updater
while (iNo > 0)
{
    printf("* ");
    iNo--;
}
}
 int main()
 {
    int iValue = 0;
    printf("Enter number");
    scanf("%d", &iValue);
    
    Display(iValue);

    return 0;
 }