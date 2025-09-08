/* input : Hello


      H  #  #  #  #
      H  e  #  #  #
      H  e  l  #  #
      H  e  l  l  #
      H  e  l  l  o
      H  e  l  l  #
      H  e  l  #  #
      H  e  #  #  #
      H  #  #  #  #    
 */
import java.util.Scanner;

class Layout
{
    public void Pattern(String str )
    {
        char arr[] = str.toCharArray();

        int i = 0, j = 0;

         for ( i = 0; i < arr.length ; i++)
        {
            for ( j = 0; j < arr.length ; j++)
            {
              if( j <= i)
              {
               System.out.print(arr[j] + "  ");
              }
              else
              {
               System.out.print(" # ");
              }
            }
             System.out.println();
        }
       
        for ( i = 1; i <arr.length ; i++)
        {
                     System.out.print(arr[0] + "  ");
            for ( j = 1; j < arr.length ; j++)
            {
              if( j < arr.length - i)
              {
               System.out.print(arr[j] + "  ");
              }
              else
              {
               System.out.print(" # ");
              }
            }
             System.out.println();
        }

     }
}

  class program245
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