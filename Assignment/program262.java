/*
input:
Enter elements of first array:
2 9 7 5 3 4
Enter elements of second array:
9 3 5 1

output:
Elements of  array:
2  1

*/

import java.util.*;


class MyArray
{
    public void MinArray(int Arr1[], int Arr2[])
    {
        int i = 0 ;
        int iMin1 = Arr1[0], iMin2 = Arr2[1];

        for(i = 0; i < Arr1.length;i++)
        {
            if(Arr1[i] < iMin1)
            {
               iMin1 = Arr1[i]; 
            }
        }
        for(int j = 0; j < Arr2.length;j++)
        {
            if(Arr2[j] < iMin2)
            {
               iMin2 = Arr2[j];
            }
                    
        }
         
         System.out.println(iMin1 + "  " + iMin2);

    }
}


class program262
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
          
        System.out.println("Elements of array:");
        aobj.MinArray(arr1, arr2);

        sobj.close();
    
    }
}
