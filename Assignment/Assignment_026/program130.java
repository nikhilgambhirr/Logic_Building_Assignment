import java.util.Scanner;

class Layout
{
    public void StrRevX(String str)
    {
      char arr [] = str.toCharArray();
       int start = 0;
       int end = arr.length - 1;
       char temp =0;
      

       while(start < end)
       {
         temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;                                                                   
      }
        System.out.println("Modifiled String is "+new String(arr));

    }
}

  class program130
 {
   public static void main(String A[])
   {    
      char[] Arr = new char[20];
      
      
          Scanner sobj = new Scanner(System.in);

         System.out.print("Enter the String : ");
         String input = sobj.nextLine();
         
          Arr = input.toCharArray();

        

         Layout mobj = new Layout();

          mobj.StrRevX(new String(Arr)); 

    

          
          sobj.close();
   }
    
 }