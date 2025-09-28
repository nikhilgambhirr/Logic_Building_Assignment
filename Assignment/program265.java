/*
input:
Enter elements of first array:
2 9 7 5 3 4
Enter elements of second array:
9 3 5 1

output:

false

false
*/

import java.util.*;


class MyArray
{
    public boolean ChekPallindrome(int Arr[])
    {
      int i = 0, j = 0;
      int n = Arr.length;
      
      for( i = 0; i < n; i++)
      {
         if(Arr[i] != Arr[n - 1 - i])
         {
            return false;
         }
      }
      return true;
    }
}


class program265
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

        System.out.println("Enter the Size of second Array : \n");
        int n2 = sobj.nextInt();

        int arr2[] = new int[n2];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = sobj.nextInt();
        }


        MyArray aobj = new MyArray();

         System.out.println(aobj.ChekPallindrome(arr1));
         System.out.println(aobj.ChekPallindrome(arr2));
                
        
        sobj.close();
    
    }
}
