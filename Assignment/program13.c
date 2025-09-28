/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 10/05/2025
//
///////////////////////////////////////////////
#include<stdio.h> 

void DisplayEvenFactor(int iNo)
{
    int i = 0;

    if(iNo <= 0)
    {
        iNo = -iNo;
    }
      for(i = 1; i <= iNo /1; i++)
    
    {
          if((iNo % i== 0)&& (i % 2 == 0))// even factor sathi logic 
        
        
          {

             printf("%d ",i);
             
      
     }
   }
}
 int main()
 {  
     int iValue = 0;

     printf("Enter number :\n");
     scanf("%d",&iValue);

     DisplayEvenFactor(iValue);

     return 0;

 }