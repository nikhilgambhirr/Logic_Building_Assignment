/*
            Enter the  first string :
            nikhil
            Enter the  Second string :
            nikhil
            output is :true
*/
import java.util.*;

class MyArray
{
    public boolean checkWhether(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        String temp = str1 + str1;

        return temp.contains(str2);

    }
}

class program276
{
    public static void main(String A[] ) 
    {
         Scanner sobj = new Scanner(System.in);

         System.out.println("Enter the  first string :\n");
         String str1 = sobj.nextLine();

         System.out.println("Enter the  Second string :\n");
         String str2 = sobj.nextLine();


        
       MyArray obj = new MyArray();
       boolean bRet = obj.checkWhether(str1,str2);

       System.out.println("output is :"+bRet);

    }
}