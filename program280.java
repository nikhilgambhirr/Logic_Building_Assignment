/*  
    Enter the  first string :
    Java is Fun and java IS fun JAVA because java is very popular and Fun is what makes JAVA interesting
     
    input :- j

    output: 
    ava is Fun and ava IS fun AVA because ava is very popular and Fun is what makes AVA interesting
*/
import java.util.*;

class MyArray
{
    public void occursMaximum(String str, char ch)
    {
       StringBuilder Array = new StringBuilder();

       int i = 0;

       for(i = 0; i < str.length(); i++)
       {
           if(str.charAt(i) != ch && str.charAt(i) != Character.toUpperCase(ch)) // user ne 'a' deu kivha 'A' deu 
           {
              Array.append(str.charAt(i)); //user ne dilela  character asel to skip karnar nasel tr hyat save karnar
           }
       }
       System.out.println("new String: "+"-> " +Array.toString()); // he print karnar new string

    }
}

class program279
{
    public static void main(String A[] ) 
    {
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter the  first string :");
         String str1 = sobj.nextLine();

         System.out.println("Enter the  Remove that character :");
         char ch = sobj.next().charAt(0);


     
        
       MyArray obj = new MyArray();
       obj.occursMaximum(str1,ch);

        sobj.close();

       

    }
}