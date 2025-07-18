/*    

 */
import java.util.*;

class Layout
{
    public  int Frequency(int Arr[], int iLength )
  {
     int i = 0, iCount = 0;

        for(i = 0; i < iLength;i++)
        {
           if(Arr[i] == 11)
          {
            iCount++;
          }
        }
        return iCount;
  }

}
class program94
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

       iRet= mobj.Frequency(Arr , iSize);

      System.out.println("11 Number is  :" + iRet);
  
    
}
        
}
   