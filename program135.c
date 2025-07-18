#include<stdio.h>

void StrCatX(char *src, char *dest)
{
    
    while(*src != '\0') 
    {   
           src++;               // pahili string shevt parynt janar
    }
    while(*dest != '\0')
    {                            // mg  ekamekana jod nar
           *dest = *src;  
            src++;
            dest++;
    }
    *dest ='\0';
    
}
int main()
{
    char arr[30] = "Marvellous Infosystem";
    char brr[30] = "Logic Building";

    StrCatX(arr,brr);

    printf("%s\n",arr);    // sangali String print honar

    return 0;

}