/*
Elements of the matrix are :
  1       2       3
  4       5       6
  7       8       9
  10      11      12

Trace of matrix = 15
Normal of matrix = 16.881943016134134

*/

import java.util.*;

class Swap
{
    public void Pattern(int [][]Arr,int iRow, int iCol)
    {
        int track = 0;
        double sumSquares = 0;
        for(int j = 0; j < iCol; j++)
        {
            for (int i = 0; i < iRow; i++)
            { 
                if (j == i)
                {
                   track +=Arr[i][j];           
                }
                sumSquares += Math.pow(Arr[i][j],2);
            }
        }
        double normal = Math.sqrt(sumSquares);

        if(iRow == iCol)
        {
            System.out.println("\nTrace of matrix = "+track);
        }
        else
        {
            System.out.println("Trace is not defined for non-square matrices. \n");

        }
        System.out.println("Normal of matrix = " + normal);


    }

  
    public void Display(int [][]Arr,int iRow,int iCol)
    {
        System.out.println(" matrix are : ");

        int i = 0, j = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }  
}


class program254
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Row : ");
        int row = sobj.nextInt();

        System.out.println("Enter Column : ");
        int col = sobj.nextInt();

        int [][]Arr = new int[row][col];

        System.out.println("Enter matrix elements:");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        Swap tobj = new Swap();

        tobj.Display(Arr,row,col);

        tobj.Pattern(Arr,row,col);
        
        sobj.close();
    }
}
