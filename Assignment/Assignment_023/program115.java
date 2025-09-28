import java.util.Scanner;
class Layout
{
     public  void  Display(char ch)
     {
             int Ascii = (int) ch;
             System.out.println("Decimal :" + Ascii);

             System.out.println("octal : %04o\n", + Ascii);

             System.out.println("Hexadecimal : 0x%2x\n", + Ascii);

     }
}
class program115
{
    public static void main(String A[] ) 
    {
           Scanner sobj = new Scanner(System.in);
           char cValue = '\0';
       
           System.out.println("Enter the character : ");
            cValue = sobj.next().charAt(0);

         Layout mobj = new Layout();

           mobj.Display(cValue);    
    }
}