/* input : irow 4        iCol : 4
              4 3 2 1
              4 3 2 1
              4 3 2 1
              4 3 2 1

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
        for (j = iCol; j >= 1; j--) //
        {
            
            System.out.print(j + " " );
        

        }
        System.out.println();
     }

  }

} 

class program233
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