/*    

 */
import java.util.Scanner;

class Layout
{
    public  int Minimum(int Arr[], int iLength)
  {
     int i = 0, iMini = Arr[0]; 

     for(i = 1; i < iLength; i++)
          {
            if(Arr[i] < iMini )
            {
                
                iMini = Arr[i];
            }
          }
          return iMini;
  }
}
class program102
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

      int iRet = mobj.Minimum( Arr,iSize);
   
       System.out.println(" Smallest Number :" + iRet);
       

       sobj.close();
    
}
        
}
   