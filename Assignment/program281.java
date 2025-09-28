import java.util.*;

class MaximumDifference
{
     int MaxDiff(int arr[])
     {
        int i = 0;
        if(arr == null || arr.length < 2)
        {
            return -1;
        }
        int min = arr[0];
        int max = Integer.MIN_VALUE;
        

        for(i = 1; i < arr.length; i++)
        {
           int diff = arr[i] -min;
           if(diff > max)
           {
            max = diff;
           }
           if(arr[i] < min)
           {
            min =arr[i];
           }
        }
        if(max > 0)
        {
            return max;
        }
        else
        {
            return -1;
        }

     }
     
}

class program281
{
    public static void main(String A[])
    {
            MaximumDifference md = new MaximumDifference();

            int[] a1 = {2, 3, 10, 6, 4, 8, 1};
            System.out.println("Maximum difference (a1): " + md.MaxDiff(a1));

            int[] a2 = {7, 9, 5, 6, 3, 2};
            System.out.println("Maximum difference (a2): " + md.MaxDiff(a2));

            int[] a3 = {1,2,90,10,110};
            System.out.println("Maximum difference (a3): " + md.MaxDiff(a3));
    }
}