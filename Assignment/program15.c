/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 10/05/2025
//
////////////////////////////////////////////
#include<stdio.h>
 

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkVowel(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
{
        ch = ch +32;
}

if(ch == 'a'|| ch  == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
{
    return TRUE;
}
else
{
   return FALSE;
}
}
  int main()
  {

     char cValue = '\0';
     BOOL bRet = FALSE;

     printf("Enter character\n");
     scanf("%c", &cValue);

     bRet = ChkVowel(cValue);

     if (bRet == TRUE)
     {
        printf("it is vowel\n");
     } 
     else
     {
        printf("it is not vowel\n");
     }

     return 0;
     
  }