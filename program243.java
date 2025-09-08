/* input : Hello

      H  #  #  #  #
      H  e  #  #  #
      H  e  l  #  #
      H  e  l  l  #
      H  e  l  l  o
    
 */
import java.util.Scanner;

class Layout
{
    public void Pattern(String str , int iRow)
    {
        char arr[] = str.toCharArray();

        int i = 0, j = 0;

        for ( i = 0; i < iRow ; i++)
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
    }
}

  class program243
 {
   public static void main(String A[])
   {    
      
      
      
          Scanner sobj = new Scanner(System.in);

         System.out.print("Enter the String : ");
         String input = sobj.nextLine();
         
         System.out.print("Enter number of Rows : ");
         int row = sobj.nextInt();

         // Arr = input.toCharArray();

        

         Layout mobj = new Layout();

          mobj.Pattern(input,row); 

          sobj.close();
   }
    
 }