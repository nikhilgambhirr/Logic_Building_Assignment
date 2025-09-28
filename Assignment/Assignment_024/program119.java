import java.util.Scanner;

class Layout
{
    public   boolean chkVowel(String str)
    {
       char arr [] = str.toCharArray();
       int iCnt = 0;
       for (iCnt = 0; iCnt < arr.length; iCnt++) 
       {
           if(arr[iCnt] >= 'A' && arr[iCnt] <= 'Z')
          {
             arr[iCnt] = (char) (arr[iCnt] + 32);
          }
         
           if(arr[iCnt] == 'a' || arr[iCnt] == 'e' || arr[iCnt] == 'i' || arr[iCnt] =='o' || arr[iCnt] =='u' )
          {
              return true;
          }
          
       }
            return false;
           
   }  

}


 class program119 
 {
    public static void main(String A[] ) 
    { 
         char[] arr = new char[20];
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String");
        String str = sobj.nextLine();

         Layout mobj = new Layout();

       bRet = mobj.chkVowel(str);
       
       if(bRet == true)
       {
       System.out.println(" contains vowel");
       }
       else
       {
          System.out.println(" contains is no vowel");
       }
       sobj.close();
        
    }
    
 }