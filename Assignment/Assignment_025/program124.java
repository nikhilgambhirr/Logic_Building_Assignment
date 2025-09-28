import java.util.Scanner;
 
class Layout
{
    public void DisplayDigits(String str)
  {
    int iCnt = 0;
   

       String Digits = " ";
       char arr [] = str.toCharArray();

   
        for (iCnt = 0; iCnt < arr.length; iCnt++) 
     {
         if(arr[iCnt] >= '0' && arr[iCnt] <= '9')
         {
             Digits +=arr[iCnt];
         }

     }
        
          System.out.println("Digits from String :" + Digits);  
       
        
  }

}

class program124
{
    public static void main(String A[] ) 
    {
         char[] arr = new char[20];

         Scanner sobj = new Scanner(System.in);
        
         System.out.println("Enter String");
         String str = sobj.nextLine();

         Layout mobj = new Layout();

         mobj.DisplayDigits(str);
       
         sobj.close();

    }
}