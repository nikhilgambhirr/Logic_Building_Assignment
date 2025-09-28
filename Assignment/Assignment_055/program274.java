/*
input:
Enter elements of first array:
A b C d E f G h I  k L
output:
7 - 4 = 3

*/

import java.util.*;


class MyArray
{
    public int Diffrence(char Arr[])
    {
        int i = 0 ,iCount1 = 0 , iCount2 = 0;
         for(i = 0; i < Arr.length; i++)
         {
             if(Arr[i] >='A' && Arr[i] <= 'Z' )
            {
              iCount1++;
            }
            if(Arr[i] >='a' && Arr[i] <= 'z')
            {
                iCount2++;
            }
         }
      return iCount1 - iCount2;
    }
    
}


class program274
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of first array :\n");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        MyArray aobj = new MyArray();
        int iRet = aobj.Diffrence(Arr);

        System.out.println(iRet);
        sobj.close();
    
    }
}
