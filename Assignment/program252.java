/*

Elements of the matrix are :
    1       2       3
    4       5       6
    7       8       9
    10      11      12
Elements of the matrix are :
    2   1   4   3
    6   5   8   7
    10  9  12  11
 
    
*/

import java.util.*;
 class Swap
 {
 public void Pattern(int [][]Arr,int iRow, int iCol)
    {     
        int temp = 0;
        for(int i = 0; i < iRow; i++)
        {
             
            for (int j = 0; j < iCol-1; j+=2)
            { 
                temp = Arr[i][j];
                Arr[i][j] = Arr[i][j+1];
                Arr[i][j+1] = temp;
            }
            
        }
    }

      
    public void Display(int [][]Arr,int iRow,int iCol)
    {
        System.out.println("Elements of the matrix are : ");

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


class program252
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

        tobj.Display(Arr,row,col);

        
        sobj.close();
    }
}
