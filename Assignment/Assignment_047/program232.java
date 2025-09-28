/* input : irow 4        iCol : 4
         1 2 3 4
         1 2 3 4
         1 2 3 4
         1 2 3 4

*/

import java.util.*;
 
class Layout
{
    public void Pattern(int iRow, int iCol)
   {
      int i = 0, j = 0;
      int iNo = 1;
      int Arr = 0;

     for (i = 0; i < iRow; i++)
     {
        for (j = 0; j < iCol; j++)
        {
            
            System.out.print((j + 1)+ " " );
        

        }
        System.out.println();
     }

  }

} 

class program232
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