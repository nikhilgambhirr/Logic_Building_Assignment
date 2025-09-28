/* input : Hello

      H  e  l  l  o
      H  e  l  l  
      H  e  l  
      H  e 
      H
 */
import java.util.Scanner;

class Layout
{
    public void Pattern(String str )
    {
        char arr[] = str.toCharArray();

        int i = 0, j = 0;

        for ( i = arr.length ; i >=1; i--)
        {
            for ( j = 0; j < i ; j++)
            {
               System.out.print(arr[j] + "  ");
            }
             System.out.println();
        }
    }
}

  class program237
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