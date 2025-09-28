// input : HE llo WOr ID
//output : 3
#include<iostream>
using namespace std;


int WhiteSpace(char * str)
{  
    if(*str == '\0')
    {
        return 0;
    }
    else if(*str == ' ')
    {
        return 1 + WhiteSpace(str + 1);
    }
    else
    {
        return WhiteSpace(str +1);
    }
   
}
int main()
{
    int iValue = 0, iRet = 0;
    char Arr[50];
    cout << "Enter a String: ";
    cin.getline(Arr,50);

    iRet = WhiteSpace(Arr);

    cout << " WhiteSpace are : " << iRet;


    return 0;
}