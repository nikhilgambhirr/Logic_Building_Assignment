import java.util.*;

 class TransposeMatrix
 {
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Row :");
        int row = sc.nextInt(); 

        System.out.println("Enter the Colum :");
        int col = sc.nextInt();

        int a[][] = new int[row][col];
        int transpose[][] = new int[col][row];

        System.out.println("Enter elements of matrix a :");

        for(int i = 0; i < row; i++)
        {
             for(int j = 0; j < col; j++)
             {
                System.out.print("Element["+(i + 1)+ ","+(j + 1) +"] ");
                a[i][j] = sc.nextInt();
             }
        }
        System.out.println("Matrix a :");

        for(int i =0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(a[i][j] +"\t");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < row; i++) 
         {
            for (int j = 0; j < col; j++) 
            {
                transpose[j][i] = a[i][j];
            }
        }
        System.out.println("::: Transpose Matrix :::");
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }


    }
}