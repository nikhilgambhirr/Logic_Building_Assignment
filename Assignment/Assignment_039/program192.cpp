#include<iostream>
using namespace std;

template<class T>
T Frequency(T *arr,int iSize,T no)
{
    int i = 0, iCount = 0;

    for(i = 0; i < iSize;i++) 
    {
        if( arr[i] == no)
        {
           iCount++;
        }
    }
    return iCount;
    
}
int main()
{
    int arr[]= {10,20,30,10,30,40,10,40,10};
    int iRet = Frequency(arr,9,40);

    cout<<iRet;
   
    
    return 0;
}