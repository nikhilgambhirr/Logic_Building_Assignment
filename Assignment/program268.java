/*
input:
Enter elements of first array:
A b C d E f G h I  k L
output:
6

*/

import java.util.*;


class MyArray
{
    public int ArrayCapital(char Arr[])
    {
        int i = 0,Count = 0;
         for(i = 0; i < Arr.length; i++)
         {
            if(Arr[i] >='A' && Arr[i] <= 'Z')
            {
                Count++;
            }
         }
         return Count;
    }
    
}


class program268
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of first array :\n");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        MyArray aobj = new MyArray();
        int iRet = aobj.ArrayCapital(Arr);

        System.out.println(iRet);
        
        sobj.close();
    
    }
}
