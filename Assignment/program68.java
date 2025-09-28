// input  4  4
 /*
  output :-    a  b  c  d  e
               1  2  3  4  5
               a  b  c  d  e
               1  2  3  4  5
               a  b  c  d  e
               
  */

import java.util.Scanner;

class Layout
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'a';
        for(i =1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
         {
            if(i % 2 == 1)
            {
                System.out.print( (char)(ch + j - 1) + "\t ");  
            }
            else
            {
                System.out.print(j+"\t ");
            }
         }
         System.out.println();
        }    
    }
}
class program68
 {
     public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);
    int iValue1 = 0, iValue2 = 0;

    System.out.println("Enter number of rows :");
    iValue1 = sobj.nextInt();

    System.out.println("Enter number of colum :"); 
    iValue2 = sobj.nextInt();

    Layout pobj = new Layout();

     pobj.Display(iValue1, iValue2);


}
        
}
     