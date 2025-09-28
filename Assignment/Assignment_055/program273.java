/*
input:
Enter elements of first array:
A b C a d a f i d a
Search element : a 
output:
4

*/

import java.util.*;


class MyArray
{
    public int Search(char Arr[], char ch)
    {
        int iCount = 0, i = 0;;

        char target = Character.toLowerCase(ch);
;

        for(i = 0; i < Arr.length;i++)
        {
             if(Character.toLowerCase(Arr[i]) == target)

             {
                iCount++;
             }
        }

         return iCount;
      
    }
    
}


class program273
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements of first array :\n");
        String str = sobj.nextLine();

        System.out.println("Enter the charachter search :\n");
        char ch = sobj.next().charAt(0);



        char Arr[] = str.toCharArray();
    


        MyArray aobj = new MyArray();
         int iRet = aobj.Search(Arr,ch);

        System.out.println(iRet);
        sobj.close();
    
    }
}
