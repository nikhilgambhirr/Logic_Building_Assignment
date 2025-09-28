// input : 5
//output : 120
#include<iostream>
using namespace std;


int Factorial(int  iNo)
{  
   

    if( iNo < 0) // updater
    {
        iNo = -iNo;
    }
    if(iNo == 0 || iNo == 1)   // base condition
    {
        return 1;
    }
    else
    {
        return iNo * Factorial(iNo - 1);   // recursive call
    }
}
int main()
{
    int iValue = 0, iRet = 0;
    cout << "Enter a number: ";
    cin >> iValue;

    iRet = Factorial(iValue);

    cout << "Factorial is " << iRet;


    return 0;
}