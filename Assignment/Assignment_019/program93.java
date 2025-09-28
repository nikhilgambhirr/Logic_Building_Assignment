/*    

 */
import java.util.Scanner;

class Layout
{
    public  boolean Check(int Arr[], int iLength )
  {
        int i = 0;

        for(i = 0; i < iLength;i++)
        {
           if(Arr[i] == 11)
          {
            return true;
          }
       }
       return false;
  }
}
class program93
 {
     public static void main(String A[])
{
    boolean bRet = false;

    Scanner sobj = new Scanner(System.in);
    int iSize = 0, iCnt = 0;
   
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

     bRet = mobj.Check(Arr,iSize); 

      if(bRet == true)
      {
         System.out.println("11 is Present");
      }
      else
      {
         System.out.println("11 is absent");
      }
       sobj.close();   
    
}
        
}
   