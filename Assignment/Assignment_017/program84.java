/*    

 */
import java.util.*;

class Layout
{
    public void Display(int iRow,int iCol)
  {
       int i = 0, j = 0;

      for(i = 1; i <= iRow; i++)
       {
           for(j =iCol; j >= 1; j--)
          {
            if((i == 1) || (i == iRow) || (j == iCol)|| (j == 1) || (i == j))
             {
                System.out.print("*\t");
                
             }
             else if( i < j) 
             {
                System.out.print("# \t");
             }
             else  
             {
                System.out.print("$ \t");

             }

          }
       System.out.println("\n");
    }
  }   
}
class prgram84
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

    pobj.Display(iValue1,iValue2);

}
        
}
   