// input  5  5

/*
   4   4   4    4    4
   3   3   3    3    3
   2   2   2    2    2
   1   1   1    1    1
 */

import java.util.Scanner;

class Layout
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
       int iNo = iRow;
        for(i =1; i <= iRow; i++,iNo--)
        {
            for(j = 1;j <= iCol; j++)
                {
                    System.out.print(iNo +"\t");
                }
                   System.out.println();
        }
    }
}
class program64
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
     
