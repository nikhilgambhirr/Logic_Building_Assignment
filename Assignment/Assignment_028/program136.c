#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>


int main()
{
 int fd =0 ;
 char Fname [50];

 printf("enter the file name that you want to create :\n");
 scanf("%s",Fname);

 fd = open(Fname,O_RDONLY);

 if(fd==-1)
 {
    printf("unable to create the File is \n");
 }
 else
 {
    printf("file is succesfully opend at fd:%d\n",fd);
 }

close(fd);
    return 0;
}