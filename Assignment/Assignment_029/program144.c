#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountChar(char Fname[],char cValue)
{
   char Buffer[BUFFER_SIZE] = {'\0'};
   int fd = 0, iCnt = 0, iret = 0;
   int iCountChar = 0;

  
    fd = open(Fname,O_RDONLY);

    if(fd < 0)
    {
        printf("unable to open file");
        return-1;
    }
    else 
    {
        printf("file opend succesfully\n");
       
        while((iret = read(fd,Buffer,BUFFER_SIZE)) != 0)
        {
            for(iCnt = 0; iCnt < iret; iCnt++)
            {
                if( Buffer[iCnt] == cValue)
                {
                    iCountChar++;
                }
            }
            memset(Buffer,'\0',BUFFER_SIZE);
        }
        close(fd);
    }
    return iCountChar;
}
int main()
{
     char FileName[30];
     int iRet = 0;
     char cValue = '\0';

     printf("Enter the file name :");
     scanf("%s",FileName);


     printf("Enter the character :");
     scanf(" %c", &cValue);


     iRet = CountChar(FileName,cValue);

     printf("Frequency is %d",iRet);

     return 0;
}