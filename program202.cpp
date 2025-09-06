#include<iostream>
using namespace std;

template<class T>
void Display(T no)
{
    
     static int i = 1;
     if(i <= no)
     {
         cout<< i<<"\t";
         i++;
         Display(no);
        
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