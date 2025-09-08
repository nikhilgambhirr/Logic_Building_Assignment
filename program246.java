/* input : irow 4        iCol : 4
          *  *  *  #
          *  *  #  *
          *  #  *  *
          #  *  *  *
*/

import java.util.Scanner;
 
class Layout
{
    public void Pattern(int iRow, int iCol)
   {
      int i = 0, j = 0;
      int Arr = 0;

     for ( i = 0; i < iRow; i++)
     {
        for (j = 0; j < iCol; j++)
        { 
          if(i +j == iCol-1) 
          {
              System.out.print(" # ");
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


class program246
{
    public static void main(String A[] ) 
    {
         Scanner sobj = new Scanner(System.in);

         int row = 0, col = 0;
            
         System.out.println("Enter Row : ");
          row = sobj.nextInt();

         System.out.print("Enter Column : \n");
          col = sobj.nextInt();

         Layout lobj = new Layout();
         lobj.Pattern(row, col);

         sobj.close();

    }
}