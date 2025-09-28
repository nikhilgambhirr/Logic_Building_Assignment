// input : Hello
//output : 4
#include<iostream>
using namespace std;


int Small(char *str)
{  

    if(*str == '\0')   
    {
        return 0;
    }
    if (*str > 'a' && *str < 'z')
    {
          return 1 + Small(str + 1);
    }  
     else 
     {
        return Small(str + 1);
     }
    
    

}

int main()
{
    int  iRet = 0;
    char arr[20] = {'\0'};
    cout<<"Enter the String :"<<"\n";
    cin>>arr;

   iRet = Small(arr);

   cout<<iRet;
    
    
    return 0;
}