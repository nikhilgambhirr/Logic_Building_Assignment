/*
input:
Enter elements of first array:
1  2  1  3  1  5
output: 
*  *
*  *  *
*  *  *  *  *

*/

import java.util.*;


class MyArray
{
    public void Pattrn(int Arr[])
    {
        int i = 0 ;
         for(i = 0; i < Arr.length; i++)
         {
            if((i + 1) % 2 == 0)
            {
                for(int j = 1; j <= Arr[i ]; j++)
                {
                
                    System.out.print( "* ");
                }
                   System.out.println();
            }  
        
         }
    
    }
    
}


class program275
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of first array :\n");
        String str = sobj.nextLine();
        
        String[] parts = str.split("\\s+");  // split by spaces
        int Arr[] = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            Arr[i] = Integer.parseInt(parts[i]);  // convert to int
        }

             MyArray aobj = new MyArray();
             aobj.Pattrn(Arr);

             sobj.close();

    }
}
