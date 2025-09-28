// input 4 4
/*
   A  B  C   D
   a  b  c   d
   A  B  C   D
   a  b  c   d
 */

import java.util.Scanner;

class Layout
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch1 = '\0', ch2 = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch1 ='a', ch2 ='A'; j <= iCol; j++ ,ch1++,ch2++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch1+"\t");
                }
                else
                {
                    System.out.print(ch2+"\t");
                }
            }
            System.out.println();
        }
    }
}
class program62
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
     