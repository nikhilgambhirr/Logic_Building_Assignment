#include<stdio.h>

int CountOne(int iNo)
{
   int iCount = 0;
   

   while(iNo != 0 )
   {
       if(iNo & 1)  // Bits on asel tr 
       {
          iCount++;  // count kar
       }
       iNo = iNo >> 1;  // ani pude chal

   }
   return iCount;
}

int main()
{
    
    int iValue = 0;
    int iRet = 0;
    

    printf("Enter the number : \n");
    scanf("%d",&iValue);


    iRet = CountOne(iValue);

     printf("Count Number On Bits: %d\n",iRet);

    

    return 0;
}