import java.util.Scanner;

class Layout
{
    public boolean CheckChar(String str, char ch )
    {
        int i = 0;
        for( i = 0; i < str.length(); i++)
       if(str.charAt(i) == ch)
      {
           return true;
      }
        
     return false;                                                                             
    }
}
  class program126 
 {
   public static void main(String A[])
   {    
      boolean bRet = false;
      char[] Arr = new char[20];
      char cValue = 0;
      
       Scanner sobj = new Scanner(System.in);

       System.out.print("Enter the String : ");
       String input = sobj.nextLine();

       Arr = input.toCharArray();
     
       System.out.print("Enter number of character : ");
       cValue = sobj.next().charAt(0);

       System.out.println("Enter "+ cValue +" Elements");

         Layout mobj = new Layout();

          bRet = mobj.CheckChar( new String(Arr),cValue); 

          if(bRet == true)
          {
            System.out.println("character found");
          }
          else
          {
            System.out.println("character not found");

          }
          sobj.close();
   }
    
 }