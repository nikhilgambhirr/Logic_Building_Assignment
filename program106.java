/*    

 */
import java.util.Scanner;

class Layout
{
    public  boolean CheckAlpha(char ch )
  {
      if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
      {
           return true;
      }
        
     return false;   
  }
}
class program106
 {
     public static void main(String A[])
{
    boolean bRet = false;
    char cValue ='\0';

    Scanner sobj = new Scanner(System.in);
    
    System.out.print("Enter the character : ");
    cValue = sobj.next().charAt(0);

     

         Layout mobj = new Layout();

     
        bRet = mobj.CheckAlpha(cValue); 

      if(bRet == true)
      {
         System.out.println("It is character");
      }
      else
      {
         System.out.println("It is not a character");
      }
       sobj.close();   
    
}
        
}
   