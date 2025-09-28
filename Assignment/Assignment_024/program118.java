import java.util.Scanner;
 
class Layout
{
    public  int Difference(String str)
  {
    char arr [] = str.toCharArray();
    int iCapitalCount = 0, iSmallCount = 0;
    int iCnt = 0;

     for (iCnt = 0; iCnt < arr.length; iCnt++) 
     {
    
         if(arr[iCnt] >= 'A' && arr[iCnt] <= 'Z')
         {
           iCapitalCount++; 
         }
         else if(arr[iCnt]>= 'a' && arr[iCnt] <= 'z') 
         {
           iSmallCount++;
         }
          
     }
     return Math.abs(iCapitalCount - iSmallCount); // negetiv value possitive karto
  }
}

class program118
{
    public static void main(String A[] ) 
    {
        char[] arr = new char[20];
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String");
        String str = sobj.nextLine();

         Layout mobj = new Layout();

       iRet = mobj.Difference(str);

       System.out.println(" Number of  diff letters :"+iRet);
       sobj.close();

    }
}