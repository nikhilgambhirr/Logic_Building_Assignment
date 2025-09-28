/*    

 */
import java.util.*;


class Layout
{
    public  void Range(int Arr[], int iLength , int iStart, int iEnd )
  {
     int i = 0;
     

        for(i = 0; i < iLength; i++)
          {
            if(Arr[i] >= iStart && Arr[i] <= iEnd )
            {
                System.out.print(Arr[i] + " ");
            }
          }
          
          
          System.out.println();
        
  }

}
class program99
 {
     public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);
    int iSize = 0, iCnt = 0;
     
   
    System.out.print("Enter number of element : ");
    iSize = sobj.nextInt();

    System.out.println("Enter the starting point  : ");
    int iValue1 = sobj.nextInt();

    System.out.println("Enter the ending point  : ");
    int iValue2 = sobj.nextInt();
    

    int[] Arr = new int[iSize];
     
    System.out.println("Enter "+ iSize +" Elements");

    for(iCnt = 0; iCnt < iSize; iCnt++ )
    {
        System.out.print("Enter element:"+(iCnt + 1) + ":");
        Arr[iCnt] = sobj.nextInt();

    }
         Layout mobj = new Layout();

        mobj.Range(Arr,iSize,iValue1,iValue2);



       sobj.close();
    
}
        
}
   