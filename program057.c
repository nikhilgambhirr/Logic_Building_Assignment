#include<stdio.h>

void Display(int ptr[],int iSize)    // address of integers  ahe
{
    printf("Element of the array are :\n");

    int iCnt =0;

    for(iCnt = 0; iCnt < iSize; iCnt++) // for loop takala ahe hyat
    {
       printf("%d\n",ptr[iCnt]);
        
    }
    
    
    

}

int main()
{

    int Arr[5];
    int iCnt = 0;

     printf("Enter the elements : \n");
     for (iCnt = 0; iCnt < 5; iCnt++)
     {
       scanf("%d",&Arr[iCnt]);    
     }                          

     
   Display(Arr,5); // display (100,5);
     


    return 0;

    

}