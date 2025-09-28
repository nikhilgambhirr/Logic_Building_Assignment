/*
input:
Enter elements of first array:
22 95 74 58 37 49
output:
22 59 47 85 73 94
*/

import java.util.*;


class MyArray
{
    public void reverseArray(int Arr[])
    {
      int i = 0;
      for( i = 0; i < Arr.length; i++)
      {
         int No = Arr[i];
         int RevNo = 0;
         while (No != 0) 
         {
             RevNo = RevNo * 10+ (No % 10);
             No = No / 10;   
         }
         Arr[i] = RevNo;
       } 
    }
}


class program266
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

           aobj.reverseArray(arr1);

          System.out.println("Elements of array:");
               
        for(int i  : arr1)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        
        sobj.close();
    
    }
}
