#include<stdio.h>

int CountOne(int iNo1, int iNo2)
{
    int iMask = 1;
   int pos = 1;
   

   while(iMask != 0 )
   {
       if((iNo1 & iMask) && (iNo2 & iMask))  
       {
         printf("Common On Bit at Positin : %d\n",pos);
       }
       iMask = iMask << 1;  
       pos++;
      
   }
}

int main()
{
    
    int iValue1 = 0, iValue2 = 0;
    
    

    printf("Enter the number : \n");
    scanf("%d",&iValue1);

    printf("Enter the number : \n");
    scanf("%d",&iValue2);

     CountOne(iValue1,iValue2);

    return 0;
}