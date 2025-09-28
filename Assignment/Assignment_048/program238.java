/* input : Hello
      H
      H  e
      H  e  L
      H  e  l  l
      H  e  l  l  o
     
 */
import java.util.Scanner;

class Layout
{
    public void Pattern(String str )
    {
        char arr[] = str.toCharArray();

        int i = 0, j = 0;

        for ( i = 0 ; i < arr.length;i++)
        {
          System.out.print(arr[0] + "  ");

            for ( j = 1; j <= i ; j++)
            {
               System.out.print(arr[j] + "  ");
            }
             System.out.println();
        }
    }
}

  class program238
 {
   public static void main(String A[])
   {    
      
          Scanner sobj = new Scanner(System.in);

         System.out.print("Enter the String : ");
         String input = sobj.nextLine();
         
         Layout mobj = new Layout();

          mobj.Pattern(input); 

          sobj.close();
   }
    
 }