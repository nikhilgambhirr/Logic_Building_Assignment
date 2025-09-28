// input : 87983
//output : 3
#include<iostream>
using namespace std;


int Small(int iNo)
{  
   
    if( iNo < 0) // updater
    {
        iNo = -iNo;
    }
    if(iNo == 0 )   // base condition
    {
        return 9;
    }

      int digit = iNo % 10; 
      int SmallDigits = Small (iNo/10); 

     if(digit < SmallDigits)
    {
       
       return  digit;
        
    }
    else
    {
        return SmallDigits;
    }
   
}
int main()
{
    int iValue = 0, iRet = 0;
    
    cout << "Enter the Number : ";
    cin >> iValue;

    iRet = Small(iValue);


    cout << " Small Digits : " << iRet;


    return 0;
}