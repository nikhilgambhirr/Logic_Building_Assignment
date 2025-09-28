/*
input:
Enter elements of first array:
2 9 7 5 3 4
Enter elements of second array:
9 3 5 1

output:

4 3 5 7 9 2

1 5 3 9
*/

import java.util.*;


class MyArray
{
    public int[] CopyArrayRev(int Arr[])
    {
        int i = 0 ;
        int j = Arr.length;
        int revArr[] = new int[j];
        
      for(i = 0; i < j; i++)
      {
          revArr[i] = Arr[j - 1 - i];
      }
      
       return revArr;  
    }
}


class program263
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

        int rev1[] = aobj.CopyArrayRev(arr1);
        int rev2[] = aobj.CopyArrayRev(arr2);

                  
        System.out.println("Elements of array:");

        for(int i = 0; i < rev1.length; i++)
        {
            System.out.print(rev1[i] + " ");
        }
        System.out.println();


          
        System.out.println("Elements of array:");

        for(int i = 0; i < rev2.length; i++)
        {
            System.out.print(rev2[i] + " ");
        }
        System.out.println();

        
        sobj.close();
    
    }
}
