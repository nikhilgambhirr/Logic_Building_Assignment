#include<iostream>
using namespace std;

template<class T>
void Reverse(T *arr,int iSize)
{
    int temp = 0, iStart = 0, iEnd = iSize-1; // karn index 0 pasun start hote 

    while (iStart < iEnd)
    {
        temp = arr[iStart]; // hyat aapn strat chi value temp madhe takli
        arr[iStart] = arr[iEnd]; // end chi value start madhe
        arr[iEnd] = temp;// hyat temp chi value end madhe
         iStart++;
         iEnd--;
         cout<<" ";
    }
    cout<<"\n";
    
}
int main()
{
    int arr[]= {10,20,30,10,30,40,10,40,10};
    for(int i = 0;i <9; i++)
    {
        cout<<arr[i]<<" ";
    }
    Reverse(arr,9);

    for(int i = 0; i < 9; i++)
    {
        cout<<arr[i]<<" ";
    }
   
    
    return 0;
}