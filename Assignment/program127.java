import java.util.Scanner;

class Layout
{
    public int CountChar(String str, char ch )
    {
        int i = 0, iCount = 0;
        for( i = 0; i < str.length(); i++)
       if(str.charAt(i) == ch)
      {
           iCount++;
        
      }
        
     return iCount;                                                                             
    }
}
  class program127
 {
   public static void main(String A[])
   {    
      int iRet = 0;
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

         iRet = mobj.CountChar( new String(Arr),cValue); 

        System.out.println("character Frequency is "+iRet);

          
          sobj.close();
   }
    
 }