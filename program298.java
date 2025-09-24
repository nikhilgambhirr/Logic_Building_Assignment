/*
         Enter the Number:
         6
         0 1 1 2 3 5

*/
import java.util.*;
class Layout
{
    public int FibonacciSeries(int no)
    {
      int i = 0, a = 0, b = 1, ans = 0;
      
      if(no >= 1)// karn he tyachya jagyavar rahnar 
      {
         System.out.print(a + " ");
      }
      if(no>= 2)// he pn
      {
         System.out.print(b+" ");
      }
      for(i = 3; i <= no; i++)
      {
         ans = a +b; // 1 =  0 + 1
        System.out.print(ans + " "); 
         a = b; // 1
         b = ans;// 2 as year
      }
      System.out.println();
      return ans;
    }
}
class program298 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the Number: ");
       int iValue = sobj.nextInt();

      Layout obj = new Layout();
     int iRet= obj.FibonacciSeries(iValue);

     System.out.println("Last Fibonacci number: " + iRet);

     sobj.close();

    }
   
}