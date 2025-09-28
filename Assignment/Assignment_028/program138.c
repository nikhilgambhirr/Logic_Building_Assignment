#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

#define BUFFER_SIZE 1024

int main()
{
 int fd =0, iRet = 0;
 char Fname [50];
 char Buffer[BUFFER_SIZE] = {'\0'};

 printf("enter the file name that you want to read :\n");
 scanf("%s",Fname);

 fd = open(Fname,O_RDONLY);

 if(fd==-1)
 {
    printf("unable to create the File is \n");
 }
 else
 {
    while ((iRet = read(fd,Buffer,BUFFER_SIZE)) != 0)
    {
        write(1,Buffer,BUFFER_SIZE);

        memset(Buffer,'\0',BUFFER_SIZE);
    }

 }
    close(fd);

    return 0;
}