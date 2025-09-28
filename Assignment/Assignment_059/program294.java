/*              input:- 5
                        5

        output:-
                        *          * 
                        * *        * *
                        * * *      * * *
                        * * * *    * * * *
                        * * * * *  * * * * *


 */

import java.util.*;
class Layout
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
                                                    
        for(i = 1 ; i <= iRow; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }

            for(int q = 1; q <= (iCol - i) * 2; q++)
            {
                System.out.print(" ");
            }
            for( j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}

class program294
{
   public static void main(String A[])
   {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the Row : ");
       int iValue1 = sobj.nextInt();

       System.out.println("Enter the colum : ");
       int iValue2= sobj.nextInt();

       Layout pobj = new Layout();

        pobj.Display(iValue1, iValue2);
    

   }
    
}