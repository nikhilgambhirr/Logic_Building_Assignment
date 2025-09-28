#include<iostream>
using namespace std;

template<class T>
T Multiple(T no1, T no2)
{
   T ans = 0;
   ans = no1 * no2;
   
   return ans;
}
int main()
{
    int iRet = Multiple(10,20);
    printf("%d\n",iRet);

    float fRet = Multiple(10.0f,20.0f);
    printf("%f\n",fRet);
    
    return 0;
}