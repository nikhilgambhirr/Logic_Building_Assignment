/*  input :-5
   output:-

   #  1 * # 2 * # 3 * # 4 * # 5 * 
    
 */
 import java.util.*;

 class Layout
{
    public void Display( int iNo)
 {
     int iCnt = 0;
     

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        System.out.print("# " +iCnt+ " *\t");
    }
    System.out.println();
 }

}

 class program54
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