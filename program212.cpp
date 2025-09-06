// input : 87983
//output : 9
#include<iostream>
using namespace std;


int Max(int iNo)
{  
   
    if( iNo < 0) // updater
    {
        iNo = -iNo;
    }
    if(iNo == 0 )   // base condition
    {
        return 0;
    }

      int digit = iNo % 10; 
      int MAxDigits = Max (iNo/10); 

     if(digit > MAxDigits)
    {
       
       return  digit;
        
    }
    else
    {
        return MAxDigits;
    }
   
}
int main()
{
    int iValue = 0, iRet = 0;
    
    cout << "Enter the Number : ";
    cin >> iValue;

    iRet = Max(iValue);


    cout << " Largest Digits : " << iRet;


    return 0;
}