// input  4  4
 /*                                 
  output :-     1   2   3   4  
                2   3   4   5       
                3   4   5   6       
                4   5   6   7       
                                                 
                                     
  */                                  

import java.util.Scanner;

class Layout
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        for(i =1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
         {
            System.out.print((i + j - 1) + "\t");
         }
         System.out.println();
        }    
    }
}
class program70
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
     
