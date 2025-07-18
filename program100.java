/*    

 */
import java.util.Scanner;

class Layout
{
    public  int Product(int Arr[], int iLength)
  {
     int i = 0,  iProduct = 1;
    int iOddCount = 0; 
     for( i = 0; i < iLength; i++)
     {
        if(Arr[i] % 2 != 0)
        {
           iProduct *= Arr[i];
           iOddCount++;
        }
     }
     if(iOddCount == 0)
     {
      return 0;
     }
     else
     {
        return iProduct;
     }  
  }

}
class program100
 {
     public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);
    int iSize = 0, iCnt = 0;
    int iRet = 0;
   
    System.out.print("Enter number of element : ");
    iSize = sobj.nextInt();

    int[] Arr = new int[iSize];
     
    System.out.println("Enter "+ iSize +" Elements");

    for(iCnt = 0; iCnt < iSize; iCnt++ )
    {
        System.out.print("Enter element:"+(iCnt + 1) + ":");
        Arr[iCnt] = sobj.nextInt();

    }
         Layout mobj = new Layout();

       iRet= mobj.Product( Arr,iSize);
   
       System.out.println(" Product is :" + iRet);
       

       sobj.close();
    
}
        
}
   