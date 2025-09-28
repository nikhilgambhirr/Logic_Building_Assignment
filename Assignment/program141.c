#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountCapital(char Fname[])
{
   char Buffer[BUFFER_SIZE] = {'\0'};
   int fd = 0, iCnt = 0, iret = 0;
   int iCapCount = 0;

  
    fd = open(Fname,O_RDONLY);

    if(fd < 0)
    {
        printf("Unable to open file :\n");
        return -1;
    }
    else
    {
        printf("file is  succesfully  opened  :\n");

        while ((iret = read(fd,Buffer,BUFFER_SIZE)) != 0)
        {
            for(iCnt = 0; iCnt < iret; iCnt++) 
            {
                if((Buffer[iCnt] >= 'A') && (Buffer[iCnt]<= 'Z'))
                {
                    iCapCount++;
                }
            } 
            memset(Buffer,'\0',BUFFER_SIZE);

        }
        close(fd);
    }
    return iCapCount;
}
int main()
{
     char FileName[30];
     int iRet = 0;

     printf("Enter the file name :");
     scanf("%s",FileName);

     iRet = CountCapital(FileName);

     printf("Number of capital character are %d\n",iRet);

     return 0;
}