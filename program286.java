/*
 *     Enter the Number :- 5
      
                 A
              A  B  A 
           A B  C  B  A
         A  B  C  D  C  B  A
       A  B  C  D  E  D  C  B  A  
 */
import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

class Pattern2
{
    private int num;

    public void setNum(int num)
    {
        this.num = num;
    }
    public int getNum()
    {
        return this.num;
    }
    public void printAnswer()
    {
       int i = 0; 

       for(i = 1; i <= num;i++) //row sathi for loop
       {
        // space disnya sasthi loop
        for(int s = 1; s <= num - i; s++)
        {
           System.out.print(" ");
        }

       int ch;

       for(ch = 0; ch < i; ch++)
       {
        System.out.print((char)('A' + ch)+" ");
       }
       for(ch = i - 2; ch >= 0; ch--)
       {
        System.out.print((char)('A' + ch)+" ");
       }
       System.out.println();
     }
    }
    public void inputNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        setNum(num);
    }
    public static void main(String A[])
    {
        Pattern2 obj = new Pattern2();
        obj.inputNum();
        obj.printAnswer();
    }
}