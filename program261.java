/*
input:
Enter elements of first array:
2 9 7 5 2 4
Enter elements of second array:
9 3 5 2

output:
Elements of  array:
29  - 19 = 10

*/

import java.util.*;


class MyArray
{
    public int Summation(int Arr1[], int Arr2[])
    {
        int i = 0 ;
        int iSum1 = 0, iSum2 = 0;

        for(i = 0; i < Arr1.length;i++)
        {
            iSum1 += Arr1[i];
        }
        for(int j = 0; j < Arr2.length;j++)
        {
            iSum2 += Arr2[j];
                    
        }
         
         return iSum1 - iSum2;
    }
}


class program261
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
        int iRet = aobj.Summation(arr1, arr2);

        System.out.println("Elements of array:");
        System.out.println(iRet);



        sobj.close();
    
    }
}
