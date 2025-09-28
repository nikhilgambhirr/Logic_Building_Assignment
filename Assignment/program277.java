/* 
          Enter the  first string :
          Java is fun and Java is powerful and fun
          
          Input:-

          Java -> 2
          is -> 2
          fun -> 2
          and -> 2
          powerful -> 1
*/
import java.util.*;

class MyArray
{
    public void Frequency(String str)
    {
       String[]words = str.split("\\s+");
       
       boolean[] Array = new boolean[words.length];

       int i = 0, j = 0;

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
            System.out.println(words[i] + " -> " + iCount);
       }

    }
}

class program277
{
    public static void main(String A[] ) 
    {
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter the  first string :\n");
         String str1 = sobj.nextLine();

     
        
       MyArray obj = new MyArray();
        obj.Frequency(str1);

        sobj.close();

       

    }
}