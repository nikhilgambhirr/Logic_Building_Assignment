// input : 87983
//output : 3
#include<iostream>
using namespace std;


int Recursive(int iNo, int rev)
{  
   //int digit = 0,rev = 0;
    if( iNo < 0) // updater
    {
        iNo = -iNo;
    }
    if(iNo == 0 )   // base condition
    {
        return rev;
    }
       int digit = iNo % 10;
        rev = rev * 10 + digit;

        return Recursive(iNo / 10,rev);


      
   
}
int main()
{
    int iValue = 0, iRet = 0;
    
    cout << "Enter the Number : ";
    cin >> iValue;

    iRet = Recursive(iValue,0);


    cout << " Recursive Number are : " << iRet;


    return 0;
}