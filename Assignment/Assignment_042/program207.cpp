#include<iostream>
using namespace std;

template<class T>
int Sum(T no)
{  
    static int iSum = 0, idigits = 0;
    if(no > 0 ) 
    {
       idigits = no % 10;
       iSum = iSum + idigits;
       no = no / 10;
        Sum(no);         
    }
    return iSum;
    
}
int main()
{
    int iValue = 0, iRet = 0;
    cout<<"Enter the Number :"<<"\n";
    cin>>iValue;

   iRet = Sum(iValue);

   cout<<iRet;
    
    
    return 0;
}