#include<iostream>
using namespace std;

template<class T>
void Display(T no)
{  
    static char ch = 'a';

     if (no >= 1)
     {
        cout<<ch<<"\t";
        ch++;
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