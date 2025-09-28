import java.util.Scanner;

class Layout
{
    public  void Reverse(String str)
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

       System.out.println("Modified String :" + new String(arr));
       
    }
 }  
 class program120
 {
    public static void main(String A[] ) 
    { 
         char[] arr = new char[20];
         

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String");
        String str = sobj.nextLine();

        Layout mobj = new Layout();

         mobj.Reverse(str);
       
        sobj.close();
        
    }
    
 }