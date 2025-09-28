/*
input:
Enter elements of first array:
2 9 7 5 2 4
Enter elements of second array:
9 3 5 2

output:
Elements of  array:
2 9 7 5 2 4 9 3 5 2 

*/

import java.util.*;


class MyArray
{
    public int[] Combine(int Arr1[], int Arr2[])
    {
        int i = 0 ;
        int Size1 = Arr1.length;
        int Size2 = Arr2.length;

        int iCol[] = new int[Size1 + Size2]; 

        for(i = 0; i < Size1;i++)
        {
            iCol[i] = Arr1[i];
        }
        for(int j = 0; j < Size2;j++)
        {
            iCol[Size1 + j] = Arr2[j];
              
        }
         return iCol;
    }
}


class program259
{
    public static void main(String A[] ) 
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of first array  :\n ");
        int n1 = sobj.nextInt();

        int arr1[] = new int[n1];
        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n1; i++)
        {
            arr1[i] = sobj.nextInt();
        }


       
        System.out.println("Enter the Size of second Array : \n");
        int n2 = sobj.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = sobj.nextInt();
        }


        MyArray aobj = new MyArray();
        int iCol[] = aobj.Combine(arr1, arr2);

        System.out.println("Elements of array:");
        for(int i = 0; i < iCol.length; i++)
        {
            System.out.print(iCol[i] + " ");
        }

        sobj.close();
    
    }
}
