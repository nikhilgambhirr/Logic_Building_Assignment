/*    

 */
import java.util.Scanner;

class Layout
{
    public  void Digits(int Arr[], int iLength)
  {
     int i = 0;

      for(i = 0; i < iLength; i++)
        {   
            if( Arr[i]>= 100 && Arr[i] <= 999)
            {
                System.out.println(Arr[i]+" ");
            }
         }
            System.out.println();
  }
}
class program104
 {
     public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);
    int iSize = 0, iCnt = 0;
    
   
    System.out.print("Enter number of element : ");
    iSize = sobj.nextInt();

   // System.out.print("Enter number of : ");
    //int iValue = sobj.nextInt();

    int[] Arr = new int[iSize];
     
    System.out.println("Enter "+ iSize +" Elements");

    for(iCnt = 0; iCnt < iSize; iCnt++ )
    {
        System.out.print("Enter element:"+(iCnt + 1) + ":");
        Arr[iCnt] = sobj.nextInt();

    } 
         Layout mobj = new Layout();

       mobj.Digits( Arr,iSize);
       
       sobj.close();
    
}
        
}
   