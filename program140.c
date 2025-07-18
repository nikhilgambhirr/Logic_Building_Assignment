#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

int main()
{

 int fd = 0, iRet = 0;
 char Fname [50] = {"\0"};
 char Buffer[BUFFER_SIZE] = {'\0'};
 

 printf("enter the file name that you want to read :\n");
 scanf("%s",Fname);

 printf("enter the String to want to write  :\n");
 scanf("%[^\n]", Buffer);


 fd = open(Fname , O_RDWR | O_APPEND);

 if(fd == -1)
 {
    printf("unable to create the File is \n");
    return -1;
 }
 else
 {
    iRet = write(fd,Buffer,strlen(Buffer));

    printf("%d new character gets writen in file\n",iRet);
 }
    close(fd);

    return 0;
}