/* input : Hello


      H  e  l  l  o
      H  e  l  l  *
      H  e  l  *  *
      H  e  *  *  *
      H  *  *  *  *
    
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
              if( j < arr.length - i)
              {
               System.out.print(arr[j] + "  ");
              }
              else
              {
               System.out.print(" * ");
              }
            }
             System.out.println();
        }
    }
}

  class program242
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