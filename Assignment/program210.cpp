// input : 523
//output : 30
#include<iostream>
using namespace std;


int Mult(int  iNo)
{  
    int digit = 0;
    if( iNo < 0) // updater
    {
        iNo = -iNo;
    }
    if(iNo == 0 )   // base condition
    {
        return 1;
    }
    else
    {
        digit = iNo % 10;
        return digit * Mult(iNo/10);   // recursive call
    }
}
int main()
{
    int iValue = 0, iRet = 0;
    cout << "Enter a number: ";
    cin >> iValue;

    iRet = Mult(iValue);

    cout << " Multifunction of Digits : " << iRet;


    return 0;
}