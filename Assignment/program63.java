// input 3  4
/*
   A  A  A  A
   B  B  B  B
   C  C  C  C 
 */

import java.util.Scanner;

class Layout
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch = 'A';

        for(i = 1, ch = 'A'; i <= iRow; i++,ch++)
        {
            for(j = 1;j <= iCol; j++)
                {
                    System.out.print(ch+"\t");
                }
                   System.out.println();
        }
    }
}
class program63
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
     