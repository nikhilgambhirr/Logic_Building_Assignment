/*    

 */
import java.util.*;

class Layout
{
    public int Diffrence(int Arr[] ,int length)
  {
    int iSum = 0, iOdd = 0 ;
    int i = 0; 

    for( i= 0; i < length; i++)
    {
        if(Arr[i] % 2 == 0)
        {
            iSum += Arr[i];
        }
        else 
        {
            iOdd += Arr[i];
        }
    }
    return iSum - iOdd;
 }
}
class program86
 {
     public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);
    int iSize = 0, iRet = 0, iCnt = 0;

    System.out.print("Enter number of element :");
    iSize = sobj.nextInt();

  int[] number = new int[iSize];

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        System.out.print("Enter element:"+(iCnt + 1) + ":");
        number[iCnt] = sobj.nextInt();

    }   

    Layout obj = new Layout();
       iRet = obj.Diffrence(number, iSize);

       System.out.println("Result is :"+ iRet);

       sobj.close();
}
        
}
   