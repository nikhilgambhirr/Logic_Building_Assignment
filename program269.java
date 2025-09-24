/*
input:

output:
6

*/

import java.util.*;


class MyArray
{
    public void Percentage(float Arr[])
    {
        int i = 0;
         for(i = 0; i < Arr.length; i++)
         {
            float Marks = Arr[i];
            if(Marks < 35)
            {
               System.out.println("Fail\n");
            }
            else if(Marks < 50)
            {
               System.out.println("Pass Class\n");        
            }
            else if(Marks < 60)
            {
               System.out.println("Second Class\n");
            }
            else if(Marks < 70)
            {
               System.out.println("First Class\n");
            }
            else 
            {
               System.out.println("First Class with Distinction\n");

            }
            
         }
         
    }
    
}


class program269
{
    public static void main(String A[] ) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Student:\n");
        int cnt = sobj.nextInt();

        float Arr[] = new float[cnt];

        System.out.println("Enter Marks of Student :\n");
        for(int i = 0; i < cnt; i++)
        {
            Arr[i] = sobj.nextFloat();
        }

        MyArray aobj = new MyArray();

        aobj.Percentage(Arr);

        
        sobj.close();
    
    }
}
