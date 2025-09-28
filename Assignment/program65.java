// input  3  4
 /*
  output :-    1  2  3  4
               5  6  7  8
               9  10  11  12
  */

import java.util.Scanner;

class Layout
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iNo = 1;
        for(i =1; i <= iRow; i++)
        {
            for(j = 1;j <= iCol; j++,iNo++)
                {
                    System.out.print(iNo +"\t");
                }
                   System.out.println();
        }
    }
}
class program65
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
     