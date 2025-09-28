#include<stdio.h>

int KMtoMeter(int iNo)
{
      int iCnt =0;
      int iKm = 1000;
    
      if( iNo * iKm )
      {
        iCnt = iNo * iKm;
      }
}
int main()
{
      int iValue = 0, iRet = 0;

      printf("Enter  distance:");
      scanf("%d",&iValue);

      iRet = KMtoMeter(iValue);

      printf("Distance in Meters : %d\n",iRet);

      return 0;
}