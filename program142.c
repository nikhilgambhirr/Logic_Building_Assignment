#include<stdio.h>
#include<stdlib.h>
#include<io.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountSmall(char Fname[])
{
   char Buffer[BUFFER_SIZE] = {'\0'};
   int fd = 0, iCnt = 0, iret = 0;
   int iSmallCount = 0;

  
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
                if((Buffer[iCnt] >= 'a') && (Buffer[iCnt]<= 'z'))
                {
                    iSmallCount++;
                }
            } 
            memset(Buffer,'\0',BUFFER_SIZE);

        }
        close(fd);
    }
    return iSmallCount;
}
int main()
{
     char FileName[30];
     int iRet = 0;

     printf("Enter the file name :");
     scanf("%s",FileName);

     iRet = CountSmall(FileName);

     printf("Number of Small character are %d\n",iRet);

     return 0;
}