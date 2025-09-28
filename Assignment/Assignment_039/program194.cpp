#include<iostream>
using namespace std;

template<class T>
T SearchLast(T *arr,int iSize,T no)
{
    int i = 0, iCount = 0, iPos = -1;

    for(i = 0; i < iSize;i++) 
    {
        if( arr[i] == no)
        {
           iPos = i+1; // fackt brak kadaycha karn ha if last paynt jato ........     
        }
    }
    return iPos;
    
}
int main()
{
    int arr[]= {10,20,30,10,30,40,10,40,10};
    int iRet = SearchLast(arr,9,40);

    cout<<iRet;
   
    
    return 0;
}