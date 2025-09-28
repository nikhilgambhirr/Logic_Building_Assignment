import java.util.Scanner;
 
class Layout
{
    public  void Display(char ch)
  {
    
    char c = 0;
     if(ch >= 'A' && ch <= 'Z')
    {
      for(c = ch; c <= 'Z'; c++)
     {
        System.out.println(c+" ");
     }
    }
    else if( ch >= 'a' && ch <= 'z')
    {
        for(c = ch; c >= 'a';c--)
        {
         System.out.println(c+" ");

        }
         System.out.println();
     }

  }
}
class program113
{
    public static void main(String A[] ) 
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);

         Layout mobj = new Layout();

        mobj.Display(cValue);

    }
}