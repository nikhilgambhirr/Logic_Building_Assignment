/*    

 */
import java.util.Scanner;

class Layout
{
    public  int Maximum(int Arr[], int iLength)
  {
     int i = 0, iMax = 0; 

     for(i = 1; i < iLength; i++)
          {
            if(Arr[i] > iMax )
            {
                
                iMax = Arr[i];
            }
          }
          return iMax;
  }
}
class program101
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
         Layout tobj = new Layout();

      int iRet = tobj.Maximum( Arr,iSize);
   
       System.out.println(" Largest Number :" + iRet);
       

       sobj.close();
    
}
        
}
   