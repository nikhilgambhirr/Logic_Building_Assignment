/*    

 */
import java.util.Scanner;

class Layout
{
    public  boolean DisplaySchedule(char chDiv )
  {
      if(chDiv == 'A' || chDiv == 'a' )
      {
        System.out.println("Your exam at 7 AM");
      } 
      else if(chDiv == 'B' || chDiv == 'b' )
      {
        System.out.println("Your exam at 8:30 AM");
      }
      else if(chDiv == 'C' || chDiv == 'c' )
      {
        System.out.println("Your exam at 9:20 AM");
      } 
     else if(chDiv == 'D' || chDiv == 'd' )
      {
        System.out.println("Your exam at 10:30 AM");
      } 
      else
      {
        System.out.println("Invalid Division");
      }
    
        
     return false;   
  }
}
class program110
 {
     public static void main(String A[])
{
    boolean bRet = false;
    char cValue ='\0';

    Scanner sobj = new Scanner(System.in);
    
    System.out.print("Enter the devision : ");
    cValue = sobj.next().charAt(0);
     
         Layout mobj = new Layout();

      bRet = mobj.DisplaySchedule(cValue); 

       sobj.close();   
    
}
        
}
   