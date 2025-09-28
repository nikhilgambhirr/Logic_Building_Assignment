/*  input :- iRow : 3    icol : 5

   output :-
            
            
    
 */
 import java.util.*;

 class Layout
{
    public void Display( int iRow,int iCol)
  {
        int i = 0, j = 0;
        

        for(i = 1; i <= iRow; i++)    
        {
            for(j = iCol; j >= 1; j--)  
            {
                if((j % 2) == 0) 
            {
                System.out.print("*\t");  
            }
            else
            {
                System.out.print("#\t");  
            }
          }
            System.out.println();
        }

  }

}

 class program59
{
    public static void main(String A[]) 
    {
     Scanner sobj = new Scanner(System.in);
     int iValue1 = 0, iValue2 = 0;

     System.out.println("Enter the Rows  :");
     iValue1 = sobj.nextInt();

     System.out.println("Enter the Coloum  :");
     iValue2 = sobj.nextInt();

     Layout pobj = new Layout();

     pobj.Display(iValue1,iValue2);

    }
}