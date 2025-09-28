/*  input :-5
   output:-

    A  B  C  D  E
    
 */
import java.util.*;

class Alphabet
{
    public void Display(  int iNo  )
 {   
      int iCnt = 0;
      char ch = 'A';
     

    for(iCnt = 0; iCnt <  iNo &&  ch <= 'Z'; iCnt++, ch++)
    {
        System.out.print(ch + "\t");
    }
    System.out.println();
 }

}

class program51
{
    public static void main(String A[]) 
    {
     Scanner sobj = new Scanner(System.in);
     int iValue = 0;

     System.out.println("Enter number :");
     iValue = sobj.nextInt();

     Alphabet pobj = new Alphabet();

     pobj.Display(iValue);

    }
}