#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

void Display (char Fname[],int iNo)
{
   char Buffer[BUFFER_SIZE] = {'\0'};
   int fd = 0, iret = 0;

    fd = open(Fname,O_RDONLY);

    if(fd < 0)
    {
        printf("unable to open file");
        
    }
    else 
    {
        printf("file opend succesfully\n");
       
        iret = read(fd, Buffer,iNo);
        
        printf("%s",Buffer);

        close(fd);
    }
}
int main()
{
     char FileName[30];
     int iValue = 0;
     
     printf("Enter the file name :");
     scanf("%s",FileName);

     printf("Enter the Number :");
     scanf("%d",&iValue);

     Display(FileName,iValue);

     return 0;
}