// input 4 4
/*
   A  B  C   D
   A  B  C   D
   A  B  C   D
   A  B  C   D
 */
import java.util.*;
class Layout
{
    public void Display(int iRow,int iCol)
  {
       int i = 0, j = 0;
      char ch ='A';
   
       for(i = 1; i <= iRow; i++)
       {
        for(j =1,ch ='A'; j <=iCol; j++,ch++) 
           {
             System.out.print(ch+"\t");
             
           }
            System.out.println();
    }
  }   
}
class program61
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

     pobj.Display(iValue1, iValue2);


}
        
}
     