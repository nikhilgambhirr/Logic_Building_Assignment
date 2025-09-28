/*  input :-8
   output:-  2  4  6  8   10    12    14   16

      
    
 */
 import java.util.*;

 class Pattern
{
    public void Display( int iNo)
 {
     int iCnt = 0;
     int multi = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
       System.out.println(iCnt *2 );
    }
    System.out.println();
 }

}

 class program55
{
    public static void main(String A[]) 
    {
     Scanner sobj = new Scanner(System.in);
     int iValue = 0;

     System.out.println("Enter number :");
     iValue = sobj.nextInt();

     Pattern pobj = new Pattern();

     pobj.Display(iValue);

    }
}