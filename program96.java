/*    

 */
import java.util.Scanner;

class Layout
{
    public  boolean Check(int Arr[], int iLength,int iNo )
  {
        int i = 0;

        for(i = 0; i < iLength;i++)
        {
           if(Arr[i] == iNo)
          {
            return true;
          }
       }
       return false;
  }
}
class program96
 {
     public static void main(String A[])
{
    boolean bRet = false;

    Scanner sobj = new Scanner(System.in);
    int iSize = 0, iCnt = 0;
   
    System.out.print("Enter number of element : ");
    iSize = sobj.nextInt();

    System.out.print("Enter number : ");
    int iValue = sobj.nextInt();

    int[] Arr = new int[iSize];
     
    System.out.println("Enter "+ iSize +" Elements");

    for(iCnt = 0; iCnt < iSize; iCnt++ )
    {
        System.out.print("Enter element:"+(iCnt + 1) + ":");
        Arr[iCnt] = sobj.nextInt();

    }
         Layout mobj = new Layout();

        bRet = mobj.Check(Arr,iSize,iValue); 

      if(bRet == true)
      {
         System.out.println("True");
      }
      else
      {
         System.out.println("False");
      }
       sobj.close();   
    
}
        
}
   