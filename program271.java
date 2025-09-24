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
    public void Arraysmall(char Arr[])
    {
        int i = 0;
         for(i = 0; i < Arr.length; i++)
         {
             if(Arr[i] >='A' && Arr[i] <= 'Z')
            {
               Arr[i] =(char)(Arr[i] + 32);
                //Arr[i] = Character.toLowerCase(Arr[i]); inbuild method
            }
         }
      
    }
    
}


class program271
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of first array :\n");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        MyArray aobj = new MyArray();
         aobj.Arraysmall(Arr);

        System.out.println(Arr);
        sobj.close();
    
    }
}
