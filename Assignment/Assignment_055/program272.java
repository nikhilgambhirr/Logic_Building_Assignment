/*
input:
Enter elements of first array:
A b C d E f G h I  k L
output:
a b c d e f g h i k l

*/

import java.util.*;


class MyArray
{
    public int Search(char Arr[])
    {
        int i = 0 , iCount = 0;
         for(i = 0; i < Arr.length; i++)
         {
             if(Arr[i] >='a' && Arr[i] <= 'z')
            {
               iCount++;
            }
         }
         return iCount;
      
    }
    
}


class program272
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of first array :\n");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        MyArray aobj = new MyArray();
         int iRet = aobj.Search(Arr);

        System.out.println(iRet);
        sobj.close();
    
    }
}
