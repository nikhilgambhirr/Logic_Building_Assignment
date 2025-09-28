/*
           
 */
import java.util.*;

class Layout
{
    public void AddMatrices(int row, int col,int [][]Arr, int [][]Brr)
    {
            int i = 0, j = 0;
            
            int sum [][]= new int [row][col];

         for( i=0; i<row; i++)
        {
            for( j=0; j<col; j++)
            {
                sum[i][j] = Arr[i][j] + Brr[i][j];
            }
        }

        System.out.println("two Matrix Summation :");
        for( i=0; i<row; i++)
        {
            for( j=0; j<col; j++)
            {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

    }
  public void Display(int row, int col,int [][]Arr, int [][]Brr)
  {
      int i = 0, j = 0;
      System.out.println("First Matrix:");
      for(i = 0; i < row; i++)
      {
        for(j = 0; j < col; j++)
        {
            System.out.print(Arr[i][j]+"\t");
        }
        System.out.println();
      }
     System.out.println("Second Matrix:");
      for(i = 0; i < row; i++)
      {
        for(j = 0; j < col; j++)
        {
            System.out.print(Brr[i][j]+"\t");
        }
        System.out.println();
      }
  }
    
}
class program291 
{
    public static void main(String A[])
    {  
        Scanner sobj = new Scanner(System.in);
           

        System.out.println("Enter the Row :");
        int Row = sobj.nextInt();

        System.out.println("Enter the Colum :");
        int Col = sobj.nextInt();

           int Arr[][] = new int[Row][Col];
            int Brr[][] = new int[Row][Col];
        System.out.println("Enter element of first matrix :");
        int i = 0, j = 0;
         for( i = 0; i < Row; i++)
        { 
            for(j = 0; j < Col; j++)
            {
               Arr[i][j] = sobj.nextInt();
            }
        }
        System.out.println("Enter element of Second matrix :");
        for( i = 0; i < Row; i++)
        { 
            for(j = 0; j < Col; j++)
            {
                Brr[i][j] = sobj.nextInt();
            }
        }
        



        Layout lobj = new Layout();
        lobj.Display(Row, Col, Arr, Brr);
        lobj.AddMatrices(Row, Col,Arr,Brr);

    }    
}