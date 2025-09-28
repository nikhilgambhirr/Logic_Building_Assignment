// input : Hello
//output : 5
#include<iostream>
using namespace std;


int Strlen(char *str)
{  
    int iCount = 0;

    while(*str != '\0')   
    {
        if((*str > 'A' && *str <'Z') || (*str > 'a' && *str < 'z'))
        {
          iCount++;
        }  
        str++;
    }
    return iCount;

}

int main()
{
    int  iRet = 0;
    char arr[20] = {'\0'};
    cout<<"Enter the String :"<<"\n";
    cin>>arr;

   iRet = Strlen(arr);

   cout<<iRet;
    
    
    return 0;
}