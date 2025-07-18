/*    

 */
import java.util.Scanner;

class Layout
{
    public  void DigitsSum(int Arr[], int iLength)
  {
     int i = 0, iSum = 0, iNum = 0;
     
      for(i = 0; i < iLength; i++)
        {   
            iNum = Arr[i];
            iSum = 0;
            while(iNum != 0)
            {
                iSum += iNum % 10;
                iNum = iNum / 10;
                 
            }
        
               System.out.println(iSum+" ");
            
         }
            System.out.println();
  }
}
class program105
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

       mobj.DigitsSum( Arr,iSize);
       
       sobj.close();
    
}
        
}
   