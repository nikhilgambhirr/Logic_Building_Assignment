/*  
    Enter the  first string :
    Java is Fun and java IS fun JAVA because java is very popular and Fun is what makes JAVA interesting
    Maximum frequency: java -> 5
*/
import java.util.*;

class MyArray
{
    public void occursMaximum(String str)
    {
       String[]words = str.split("\\s+");
       
       boolean[] Array = new boolean[words.length];

       int i = 0, j = 0, MAxCount = 0;
       String Word = " ";

       for(i = 0; i < words.length;i++)
       {   
        
           if(Array[i])
            {
              continue;
            }

            int iCount = 1;

            String wordLower = words[i].toLowerCase();

            for(j = i + 1; j < words.length;j++)
            {
              if(wordLower.equals(words[j].toLowerCase()))
              {
                iCount++;
                Array[j] = true;
              }
            }

            if(iCount > MAxCount )
            {
               MAxCount = iCount;
               Word = wordLower;

            }
            
       }
       System.out.println(" Maximum frequency: " + Word + " -> " + MAxCount);

    }
}

class program278
{
    public static void main(String A[] ) 
    {
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter the  first string :");
         String str1 = sobj.nextLine();

     
        
       MyArray obj = new MyArray();
        obj.occursMaximum(str1);

        sobj.close();

       

    }
}