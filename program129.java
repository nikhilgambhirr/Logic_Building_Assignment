import java.util.Scanner;

class Layout
{
    public int LastChar(String str, char ch )
    {
        int i = 0;
        for(i = str.length() - 1;  i >= 0;  i-- )
           if(str.charAt(i) == ch)
      {
                                                                        
           return i;
      }
        
     return -1;                                                                             
    }
}
  class program129
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

         iRet = mobj.LastChar(new String(Arr),cValue); 

        System.out.println("character location is "+iRet);

          
          sobj.close();
   }
    
 }