/*
    1  2  3  4
       2  3  4
          3  4
             4
 */  
import java.util.*;

class Layout
{
    public void Display(int iRow,int iCol)
  {
       int i = 0, j = 0;
       int iCnt =0;

      for(i = 1; i <= iRow; i++)
       {
           for( iCnt =1; iCnt< i; iCnt++)
           {
             System.out.print("\t");
           }
             for(j =i; j <= iCol; j++)
             {
                System.out.print(j+" \t");
                
             }
            
          
       System.out.println("\n");
    }
  }   
}
class program80
 {
     public static void main(String A[])
{
    Scanner sobj = new Scanner(System.in);
    int iValue1 = 0, iValue2 = 0;

    System.out.println("Enter number of rows :");
    iValue1 = sobj.nextInt();

    System.out.println("Enter number of colum :"); 
    iValue2 = sobj.nextInt();

    Layout pobj = new Layout();

    pobj.Display(iValue1,iValue2);

}
        
}
   