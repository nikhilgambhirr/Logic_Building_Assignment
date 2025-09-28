/*
input:
Enter elements of first array:
22 95 74 58 37 49
output:
4  14  11  13  10 13
*/

import java.util.*;


class MyArray
{
    public void SumArray(int Arr[])
    {
      int i = 0;
      for( i = 0; i < Arr.length; i++)
      {
         int No = Arr[i];
         int Sum = 0;
         while (No != 0) 
         {
             Sum +=(No % 10);
             No = No / 10; 
            
         }
         Arr[i] = Sum;
       } 
    }
}


class program267
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of first array  :\n ");
        int cnt = sobj.nextInt();

        int arr1[] = new int[cnt];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < cnt; i++)
        {
            arr1[i] = sobj.nextInt();
        }

        MyArray aobj = new MyArray();

           aobj.SumArray(arr1);

          System.out.println("Elements of array:");
               
        for(int i  : arr1)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        
        sobj.close();
    
    }
}
