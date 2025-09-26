/*

            Java program to count the number of characters in a file..........


                    Enter file name: program300.java
                    Total word count = 248
                    Total number of sentences = 88
                    Total number of characters = 1948
                    Number of paragraphs = 16
                    Total number of whitespaces = 7016
*/

import java.io.*;
import java.util.*;
class test
{
    public void testFile(String path) throws IOException
    {
         File file = new File(path);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

         String line;

        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 1;  // assume at least 1 paragraph
        int whitespaceCount = 0;

        while ((line = reader.readLine()) != null) 
        {
            if (line.equals("")) 
            {
                paragraphCount++;
            } else 
            {
                characterCount += line.length();

                // Splitting line into words
                String[] words = line.split("\\s+");
                countWord += words.length;
                whitespaceCount += countWord - 1;

                // Splitting line into sentences
                String[] sentenceList = line.split("[!?.:]+");
                sentenceCount += sentenceList.length;
            }
        }

        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);

        reader.close();

    }
}
 class program300
 {
    public static void main(String[] args) throws IOException {

        Scanner sobj = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String path = sobj.nextLine();  
        sobj.close();

        test obj = new test();
        obj.testFile(path);
    }    
}
