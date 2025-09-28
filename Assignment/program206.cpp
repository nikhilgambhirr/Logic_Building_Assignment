#include<iostream>
using namespace std;

template<class T>
void Display(T no)
{  
    if(no >= 1) 
    {
        cout<<no<<" *"<<"\t";
        
        Display(--no);         
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