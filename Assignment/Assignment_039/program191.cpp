#include<iostream>
using namespace std;

template<class T>
void Display(T Value,int iSize)
{
    int i = 0;

    for(i = 0; i < iSize;i++) // for lavnar kar loop firvaycha ahe 
    {
        cout<<Value<<" "; // print krayla 

    }
           cout<<"\n"; 
}
int main()
{
   Display('M',7);
   Display(11,3);
   Display(3.7,6);

    
    return 0;
}