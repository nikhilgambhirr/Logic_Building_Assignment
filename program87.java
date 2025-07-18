/*    

 */
import java.util.*;

class Layout
{
    public  void Display(int Arr[], int iLength )
  {
    int i = 0;
    for( i = 0; i < iLength; i++)
    {
        if(Arr[i] % 5 == 0)
        {
            System.out.print(Arr[i] + " ");
        }
    }
    System.out.println();
 }
}
class program87
 {
     public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);
    int iSize = 0, iCnt = 0;
   
    System.out.print("Enter number of element : ");
    iSize = sobj.nextInt();

    int[] number = new int[iSize];
     
    System.out.println("Enter "+ iSize +" Elements");

    for(iCnt = 0; iCnt < iSize; iCnt++ )
    {
        System.out.print("Enter element:"+(iCnt + 1) + ":");
        number[iCnt] = sobj.nextInt();

    }   
      System.out.println("Element Divisible by 5 are :\n");
 
         Layout mobj = new Layout();
        mobj.Display(number,iSize);

       sobj.close();
}
        
}
   