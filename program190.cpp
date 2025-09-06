#include<iostream>
using namespace std;

template<class T>
T Min(T *arr,int iSize)
{
    T Min = arr[0];
   for(int i = 0; i< iSize; i++)
   {
       if(arr[i] < Min)
      {
         Min =  arr[i];
      }
   }
   return Min;
}
int main()
{
    int arr[]={10,20,30,40,50};
    float brr[] = {10.0f,3.7f,7.8f,8.7f,11.9};

  
    int iRet = Min(arr,3);
  
    cout<<"Small Number : "<<iRet <<"\n";

     float fRet = Min(brr,1);
    cout<<"small Number : "<<fRet<<"\n";
    
    return 0;
}