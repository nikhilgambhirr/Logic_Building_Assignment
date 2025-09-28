/*    

 */
import java.util.Scanner;

class Layout
{
    public  boolean CheckCapital(char ch )
  {
      if(ch >= 'A' && ch <= 'Z') 
      {
           return true;
      }
        
     return false;   
  }
}
class program107
 {
     public static void main(String A[])
{
    boolean bRet = false;
    char cValue ='\0';

    Scanner sobj = new Scanner(System.in);
    
    System.out.print("Enter the character : ");
    cValue = sobj.next().charAt(0);
     
         Layout mobj = new Layout();

      bRet = mobj.CheckCapital(cValue); 

      if(bRet == true)
      {
         System.out.println("It is Capital character ");
      }
      else
      {
         System.out.println("It is not a Capital character ");
      }
       sobj.close();   
    
}
        
}
   