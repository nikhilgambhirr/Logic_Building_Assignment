#include<stdio.h>

double FhtoCs(float fTemp)
{  
  
  return (fTemp -32) * (5.0 / 9.0);
   
}

int main()
{
      float fValue = 0.0;
      double dRet = 0.0;

      printf("Enter  temperatur in Fahrenheit:");
      scanf("%f",&fValue);

      dRet = FhtoCs(fValue);

      printf("Temperature in Celsius : %lf\n",dRet);

      return 0;
}

/*
    input:- 10
    output:--12.2222  (10 - 32) * (5/9)
*/