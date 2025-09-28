/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 9/05/2025
//
///////////////////////////////////////////////#include<stdio.h>

void Display(int iNo)
{
    int iCnt = 0;
    //write updater
    while (iCnt< iNo)
    {
        printf("*\n");//
        iCnt++;
    }
    
}

int main()
{ 
    int iValue = 0;

    printf("Enter the number\n");//
    scanf("%d", &iValue);//

    Display(iValue);
    return 0;
}