/*
          Enter String:
          ABC XY PQ
          Input String : ABC XY PQ
          String with Reversed Word : CBA YX QP 
 */

import java.util.Scanner;

class ReverseEachWord
{
     String reverseWord(String inpuString)
     {
           String[] words = inpuString.split(" ");
           String str = "";

           for(String word : words)
           {
             String revesed = "";

             int i;
             for(i = word.length() - 1; i >= 0; i--)
             {
              revesed += word.charAt(i);
             }
             str += revesed + " "; 
           }
           return str.trim();
     }
}

class program288 
{
  public static void main(String A[])
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String :");
        String str1 = sc.nextLine();

        ReverseEachWord obj = new ReverseEachWord();
        String iRet = obj.reverseWord(str1);
        System.out.println("Input String : "+str1);


        System.out.println("String With reverse word : "+iRet);

  }
    
}