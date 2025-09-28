/*
input:
Enter elements of first array:
2 9 7 5 2 4
Enter elements of second array:
9 3 5 2

output:
Elements of first array:
2 2 4
Elements of second array:
2

*/

import java.util.*;


class MyArray
{
    public void DisplayOdd(int Arr1[], int Arr2[])
    {
        int i = 0 ;

        System.out.println("Elements of first array:");
        for(i = 0; i < Arr1.length;i++)
        {
            if(Arr1[i] % 2 != 0)
            {
               System.out.print(Arr1[i] + " ");
            }  
        }
        System.out.println();

       System.out.println("Elements of second array:");
        for(i = 0; i < Arr2.length;i++)
        {
            if(Arr2[i] % 2 != 0)
            {
              System.out.print(Arr2[i]+" ");
              
            }
        }
        System.out.println();
    }
}


class program258
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
        aobj.DisplayOdd(arr1, arr2);

        sobj.close();
    
    }
}
