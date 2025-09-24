/*
        Enter the first String :
        listen
        Enter the Second String :
        silent
        Anagram String !!
 */

import java.util.Arrays;
import java.util.Scanner;

class AnagramString
{
     static boolean isAngrams(String str1, String str2)
     {
         if(str1.length() != str2.length())// size baro bar asel tr aath jail
         {
            return false;
         }

         str1 = str1.toLowerCase(); // lowercase madhe convert
         str2 = str2.toLowerCase();

         char[] arr1 = str1.toCharArray();// char array madhe convert
         char[] arr2 = str2.toCharArray();

         Arrays.sort(arr1); // sorting karnar
         Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);// mg comparison karnar
     }
}

class program287 
{
     public static void main(String A[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String :");
        String str1 = sc.next();

        System.out.println("Enter the Second String :");
        String str2 = sc.next();

        if(AnagramString.isAngrams(str1,str2))
        {
            System.out.println("Anagram String !!");
        }
        else
        {
            System.out.println(" String are not Anagram String !!");
        }
     }
}