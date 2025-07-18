/*    

 */
import java.util.Scanner;

class Layout
{
    public  boolean CheckSmall(char ch )
  {
      if(ch >= 'a' && ch <= 'z')
      {
           return true;
      }
        
     return false;   
  }
}
class program109
 {
     public static void main(String A[])
{
    boolean bRet = false;
    char cValue ='\0';

    Scanner sobj = new Scanner(System.in);
    
    System.out.print("Enter the character : ");
    cValue = sobj.next().charAt(0);

         Layout mobj = new Layout();
     
      bRet = mobj.CheckSmall(cValue); 

      if(bRet == true)
      {
         System.out.println("It is Small case character");
      }
      else
      {
         System.out.println("It is not a Samll case character");
      }
       sobj.close();   
    
}
        
}
   