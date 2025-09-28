#include<iostream>
using namespace std;

template<class T>
void Display(T no)
{
     for(int i = 0; i < no; i++)
     {
        cout<<" * ";
     }
    
}
int main()
{
    int iValue = 0;
    cout<<"Enter the Number :"<<"\n";
    cin>>iValue;

    Display(iValue);
    
    
    return 0;
}