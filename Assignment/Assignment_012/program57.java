/*  input :- iRow : 3    icol : 3

   output:- 1  2  3
            1  2  3 
            1  2  3
            1  2  3
 */
 import java.util.*;

 class Pattern
{
    public void Display( int iRow,int iCol)
  {
        int i = 0, j = 0;
        

        for(i = 1; i <= iRow; i++)    // row ch logic
        {
            for(j = 1; j <= iCol; j++)  // coloum ch logic    
            {
                System.out.print(j+"\t");  // colum user input deil tas vadat rahil
            }
            System.out.println();
        }

  }

}

 class program57
{
    public static void main(String A[]) 
    {
     Scanner sobj = new Scanner(System.in);
     int iValue1 = 0, iValue2 = 0;

     System.out.println("Enter the Rows  :");
     iValue1 = sobj.nextInt();

     System.out.println("Enter the Coloum  :");
     iValue2 = sobj.nextInt();

     Pattern pobj = new Pattern();

     pobj.Display(iValue1,iValue2);

    }
}