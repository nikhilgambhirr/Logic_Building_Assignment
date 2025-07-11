#include<stdio.h>

int Summation(int ptr[],int iSize)    // address of integers  ahe
{
    

    int iCnt =0;
    int iSum = 0;
    

    for(iCnt = 0; iCnt < iSize; iCnt++) // for loop takala ahe hyat
    {
       iSum= iSum + ptr[iCnt];
        
    }

    return iSum;
    
    
    

}

int main()
{

    int Arr[5];
    int iCnt = 0, iRet = 0;

     printf("Enter the elements : \n");
     for (iCnt = 0; iCnt < 5; iCnt++)
     {
       scanf("%d",&Arr[iCnt]);    
     }    
     
     iRet = Summation(Arr,5); 

     printf("Addition is : %d\n",iRet);

     
    
     


    return 0;

    

}