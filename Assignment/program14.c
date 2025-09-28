/////////////////////////////////////////////
// 
//   File name: Program.c   
//   Desription : 
//   Author : Nikhil Kailas Gambhir
//   Date : 10/05/2025
//
//////////////////////////////////////////////
#include<stdio.h>
#include<ctype.h> // he library ahe character sathi
void DisplayConvret(char cValue)
{
    if(islower(cValue))
    {
        printf("output : %c\n",toupper(cValue));// he lowercase word upper case madhe convert karte
    }
    else if(isupper(cValue))
    {
        printf("output : %c\n",tolower(cValue));// he uppercase che word lower case madhe covert karte
    } 
    else
    {
         printf("not an alphabet chsrscter.\n"); //ani he charactor nasel tr tas sangte

    }
}

int main()
{
     char cValue  = '\0';
     printf("Enter character:\n");
     scanf(" %c", &cValue);
     DisplayConvret(cValue);
     return 0;
     }