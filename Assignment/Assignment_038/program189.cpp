#include<iostream>
using namespace std;

template<class T>
T max(T *arr,int iSize)
{

    
    T Max = arr[0];
   for(int i = 0; i< iSize; i++)
   {
       if(arr[i] > Max)
      {
         Max =  arr[i];
      }
   }
   return Max;
}
int main()
{
    int arr[]={10,20,30,40,50};
    float brr[] = {1.0f,3.7f,7.8f,8.7f,11.9};

  
    int iRet = max(arr,4);
  
    cout<<"larget Number : "<<iRet <<"\n";

     float fRet = max(brr,5);
    cout<<"Larget Number : "<<fRet<<"\n";
    
    return 0;
}