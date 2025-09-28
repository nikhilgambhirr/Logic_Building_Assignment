/*    

 */
import java.util.Scanner;

class Layout
{
    public  boolean CheckDigits(char ch )
  {
      if(ch >= '0' && ch <= '9')
      { 
           return true;
      }
        
     return false;   
  }
}
class program108
 {
     public static void main(String A[])
{
    boolean bRet = false;
    char cValue ='\0';

    Scanner sobj = new Scanner(System.in);
    
    System.out.print("Enter the Digits : ");
    cValue = sobj.next().charAt(0);

         Layout mobj = new Layout();

      bRet = mobj.CheckDigits(cValue); 

      if(bRet == true)
      {
         System.out.println("It is Digits");
      }
      else
      {
         System.out.println("It is not a Digits");
      }
       sobj.close();   
    
}
        
}
   