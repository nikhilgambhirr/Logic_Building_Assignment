import java.util.Scanner;

class Layout
{
    public  boolean ChkSpecial(char ch)
    {
       if((ch == '!') || (ch == '@') || (ch == '#' )|| (ch == '$') || (ch == '%') || (ch == '^') || (ch == '&') || (ch == '*'))
       {
            return true;
       }
            return false;
    }
}
class program114
{
    public static void main(String A[]) 
    {
           Scanner sobj = new Scanner(System.in);
           char cValue = '\0';
           boolean bRet = false;
           
           System.out.println("Enter the character : ");
            cValue = sobj.next().charAt(0);

         Layout mobj = new Layout();

           bRet = mobj.ChkSpecial(cValue);

           if(bRet == true)
           {
                System.out.println("It is  a Special character");
           }
           else
           {
                System.out.println("It is not a Special character");
           }

           sobj.close();
    }
}