import java.util.Scanner;
 
class Layout
{
    public  int CountCapital(String str)
  {
    char arr [] = str.toCharArray();
    int iCount = 0;
    int iCnt = 0;

     for (iCnt = 0; iCnt < arr.length; iCnt++) 
     {
    
         if(arr[iCnt]>= 'A' && arr[iCnt] <= 'Z')
         {
           iCount++;  
         }
          
     }
     return iCount;
  }
}

class program116
{
    public static void main(String A[] ) 
    {
        char[] arr = new char[20];
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String");
        String str = sobj.nextLine();

         Layout mobj = new Layout();

        iRet = mobj.CountCapital(str);

       System.out.println(" Number of capital letters :"+iRet);
       sobj.close();

    }
}