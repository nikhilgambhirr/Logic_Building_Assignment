import java.util.Scanner;
 
class Layout
{
    public  void Display(char ch)
  {
    char iCapital = 0, iSmall = 0;
    
    if(ch >= 'a' && ch <= 'z')
    {
        iCapital = (char )(ch - 32);
        System.out.println("character :"+iCapital);
    }
    else if(ch >= 'A' && ch <= 'Z')
    {
        iSmall = (char)(ch + 32);
        System.out.println("character :"+iSmall);
    }
    else
    {
        System.out.println("Digits and Symbol :"+ ch);
    }
  }

}
class program112
{
    public static void main(String A[] ) 
    {
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the character");
        cValue = sobj.next().charAt(0);

         Layout mobj = new Layout();

        mobj.Display(cValue);

    }
}