/*
       Write the java program to multiply two matrices


       input:-

                    Enter the first Matrix :
                    Enter the Row :
                    2
                    Enter the colum :
                    3

                    1
                    2
                    3
                    4
                    5
                    6
                    Enter the Second Matrix :
                    Enter the Row :
                    3
                    Enter the colum :
                    2
                    
                    7
                    8
                    9
                    10
                    11
                    12
                    Multipliction Matrix:
                    58 64
                    139 154

 */

 import java.util.*;

 class Layout
 {
    private int Arr[][];

    public void MatrixMultiplication(int iRow1, int iCol1, int iCol2,int[][] Arr1,int[][] Arr2)
    {
       int i = 0 , j = 0 , k = 0;

       Arr = new int[iRow1][iCol2];

       for(i = 0; i < iRow1; i++)
       {
         for(j = 0; j < iCol2; j++)
         {
            Arr[i][j] = 0;
            for(k = 0; k < iCol1; k++)
            {
                Arr[i][j] += Arr1[i][k] * Arr2[k][j];
            }
         }
       }
     
    }
      public void Display()
       {
         System.out.println("Multiplction Matrix:");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[0].length; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

 class program297 
 {
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the first Matrix : ");
       System.out.println("Enter the Row : ");
       int iValue1 = sobj.nextInt();

       System.out.println("Enter the colum : ");
       int iValue2= sobj.nextInt();

       int[][] Arr1 = new int[iValue1][iValue2];
        int i ,j;
       for(i = 0; i < iValue1; i++)
       {
         for(j = 0; j < iValue2; j++)
         {
            Arr1[i][j] = sobj.nextInt();
         } 
       }

       System.out.println("Enter the Second Matrix : ");
       System.out.println("Enter the Row : ");
       int iValue3 = sobj.nextInt();

       System.out.println("Enter the colum : ");
       int iValue4= sobj.nextInt();

       if(iValue2 != iValue3)
       {
        System.out.println("Matrix  is not ");
          return;
       }

       int[][] Arr2 = new int[iValue3][iValue4];

       for(i = 0; i < iValue3; i++)
       {
          for(j = 0; j < iValue4; j++)
          {
            Arr2[i][j] = sobj.nextInt();
          }
       }

               Layout obj = new Layout();
               obj.MatrixMultiplication(iValue1, iValue2, iValue4, Arr1, Arr2);
              obj.Display();

    }
 }