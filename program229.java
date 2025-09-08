/* input : irow 4        iCol : 4
      4 4 4 4
      3 3 3 3
      2 2 2 2
      1 1 1 1   

*/

import java.util.Scanner;
 
class Layout
{
    public void Pattern(int iRow, int iCol)
   {
      int i = 0, j = 0;
      int Arr = 0;

     for ( i = iRow; i >= 1; i--)
     {
        for (j = 0; j < iCol; j++)
        {
            
            System.out.print(i + " ");
        }
        System.out.println();
     }

  }

} 

class program229
{
    public static void main(String A[] ) 
    {
         Scanner sobj = new Scanner(System.in);

         int row = 0, col = 0;
            
         System.out.println("Enter Row : ");
          row = sobj.nextInt();

         System.out.print("Enter Column :");
          col = sobj.nextInt();

         Layout lobj = new Layout();
         lobj.Pattern(row, col);

         sobj.close();

    }
}