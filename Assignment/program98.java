/*    

 */
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

class Layout
{
    public  int LastOcc(int Arr[], int iLength , int iNo )
  {
     int i = 0;

        for(i = iLength -1; i >= 0; i--)
        {
            if(Arr[i] == iNo)
          {
                  return i; 
          }
        }
        return -1;
  }

}
class program98
 {
     public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);
    int iSize = 0, iCnt = 0;
    int iRet = 0;
    int icet = 0; 
   
    System.out.print("Enter number of element : ");
    iSize = sobj.nextInt();

    System.out.println("Enter number  : ");
    int iValue = sobj.nextInt();

    int[] Arr = new int[iSize];
     
    System.out.println("Enter "+ iSize +" Elements");

    for(iCnt = 0; iCnt < iSize; iCnt++ )
    {
        System.out.print("Enter element:"+(iCnt + 1) + ":");
        Arr[iCnt] = sobj.nextInt();

    }
         Layout mobj = new Layout();

       iRet= mobj.LastOcc( Arr,iSize,iValue);

       

       if(icet == -1)
       {
          System.out.println("There is no such number"); 
       }
       else
       {
          System.out.println(" Last occurrence of number is :" + iRet);
       }

       sobj.close();
    
}
        
}
   