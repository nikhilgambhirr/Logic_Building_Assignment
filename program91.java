/*    

 */
import java.util.*;

class Layout
{
    public  int Count(int Arr[], int iLength )
  {
    int count = 0;
    int i = 0;
    for( i = 0; i < iLength; i++)
    {
        if(Arr[i] %  2 == 0) 
        {
            count++;
     
        }
    }
    return count;
 }
}
class program91
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

      iRet= mobj.Count(Arr , iSize);

      System.out.println("Element even number count is  :" +iRet );

       
     
       sobj.close();
}
        
}
   