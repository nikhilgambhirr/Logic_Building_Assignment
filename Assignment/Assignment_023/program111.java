/*    

 */
import java.util.Scanner;

class Layout
{
    public  void DisplayASCII()
    {
      int i = 0;

        for(i = 0; i <= 255; i++)
        {
           char symbol =(char) i;
           System.out.println();
        }       
      
    }                 // rahila ahe
}
class program111
 {
     public static void main(String A[])
{
    char cValue ='\0';

    Scanner sobj = new Scanner(System.in);
    
    System.out.print("Enter the Number : ");
    cValue = sobj.next().charAt(0);
     
         Layout mobj = new Layout();

        mobj.DisplayASCII(cValue); 

       sobj.close();   
    
}
        
}
   