/* input : irow 5       iCol : 5
          1  2  3  4  5  
          1  2        5
          1     3     5
          1        4  5
          1  2  3  4  5
*/

import java.util.*;
 
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
          if( i == 0 || i == iRow -1 || j == 0 || j == iCol -1)
          {
              System.out.print((j + 1)+" ");
          }
          else if(i == j ) 
          {
              System.out.print((j + 1)+" ");
          }
          else
          {
            System.out.print("  ");
          }
          
       }
       System.out.println();

     }
   }  

} 


class program250
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