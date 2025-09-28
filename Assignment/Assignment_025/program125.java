import java.util.Scanner;
 
class Layout
{
    public int CountWhite(String str)
  {
       int iCount = 0;
       int iCnt = 0;
       char arr [] = str.toCharArray();
     
       while(iCnt < arr.length)
       {
          if(arr[iCnt] == ' ')
          {
            iCount++;
          }
          iCnt++;
       }
       return iCount;
  }

}

class program125
{
    public static void main(String A[] ) 
    {
         char[] arr = new char[20];
         int iRet = 0;

         Scanner sobj = new Scanner(System.in);
        
         System.out.println("Enter String");
         String str = sobj.nextLine();

         Layout mobj = new Layout();
         
         iRet = mobj.CountWhite(str);

         System.out.println("Count Space :"  + iRet);  

       
         sobj.close();

    }
}