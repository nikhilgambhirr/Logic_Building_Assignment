/*  input :-5
   output:-

     5 #   4 #  3 #  2 #  1 #
    
    
 */
 import java.util.*;
import java.util.regex.Pattern;

 class Layout
{
    public void Display( int iValue)
 {
     int iCnt = 0;
     

    for(iCnt = iValue; iCnt >= 1; iCnt--)
    {
        System.out.print(iCnt+ "  #   \t");
    }
    System.out.println();
 }

}

 class program52
{
    public static void main(String A[]) 
    {
     Scanner sobj = new Scanner(System.in);
     int iValue = 0;

     System.out.println("Enter number :");
     iValue = sobj.nextInt();

     Layout pobj = new Layout();

     pobj.Display(iValue);

    }
}