#include<iostream>
using namespace std;

template<class T>
T Max(T no1, T no2,T no3)
{
    T iMax = no1;

    if(no2 > iMax)
       iMax = no2;
    if(no3 > iMax)    
        iMax = no3;
    
    
    
    return iMax;
   
}
int main()
{
     int no1,no2,no3,iRet = 0; // local Vairable 
    cout<<"Enter the number \n";
    cin>>no1>>no2>>no3;

    iRet = Max(no1,no2,no3);
    cout<<"Maximum is : "<<iRet;
      
   
    
    return 0;
}