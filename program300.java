/*
    java program to merge two file alternativel into third file..

    input:-
    output:-

                     Enter First File name :
                     file1.txt
                     Enter Second File name :
                     file2.txt
                     Enter Destination File name :
                     file3.txt
                     Files merged successfully into file3.txt

        

*/
import java.util.*;
import java.io.*;

class Layout
{
    public void mergeFiles(String Fname1, String Fname2, String Fname3) throws IOException
    {
      BufferedReader fiobj = new BufferedReader(new FileReader(Fname1));
      BufferedReader fobj = new BufferedReader(new FileReader(Fname2));

      BufferedWriter ftobj = new BufferedWriter(new FileWriter(Fname3));


      String str1, str2;

      while (true) 
      {
         str1 = fiobj.readLine();
         
         if(str1 != null)
         {
            ftobj.write(str1);
            ftobj.newLine();
         }
         str2 = fobj.readLine();
         if(str2 != null)
         {
            ftobj.write(str2);
            ftobj.newLine();
         }
         if(str1 == null && str2 == null)
         {
            break;
         }
      }
      fiobj.close();
      fobj.close();
      ftobj.close();

      System.out.println("Files merged successfully into " + Fname3);

    }  
}
class program300
{
    public static void main(String A[])
    {
      try
        {
           Scanner sobj = new Scanner(System.in);
           
            System.out.println("Enter First File name : ");
            String fname1 = sobj.nextLine();


            System.out.println("Enter Second File name : ");
            String fname2 = sobj.nextLine();

            System.out.println("Enter Destination File name : ");
            String fname3 = sobj.nextLine();

            Layout lobj = new Layout();
            lobj.mergeFiles(fname1, fname2, fname3);
        }
        catch(Exception eobj)
        {
            System.out.println("Error : " + eobj);
        }
    }
}
