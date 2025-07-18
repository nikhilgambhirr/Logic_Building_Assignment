import java.util.Scanner;
 
class Layout
{
    public void Struprx(String str)
  {
    int iCnt = 0;

       char arr [] = str.toCharArray();
   
        for (iCnt = 0; iCnt < arr.length; iCnt++) 
     {
         if(arr[iCnt] >= 'a' && arr[iCnt] <= 'z')
         {
             arr[iCnt] = (char) (arr[iCnt] - 32);
         }
     }
        
       System.out.println("Modifiled String " + new String(arr));
        
  }

}

class program122
{
    public static void main(String A[] ) 
    {
         char[] arr = new char[20];

         Scanner sobj = new Scanner(System.in);
        
         System.out.println("Enter String");
         String str = sobj.nextLine();

         Layout mobj = new Layout();

         mobj.Struprx(str);


         sobj.close();

    }
}