import java.util.*;

class Distance
{
    int Feet,  inches;

     Distance addDistance(Distance d2)
     {
            Distance ans = new Distance();

            ans.Feet = this.Feet + d2 .Feet;
            ans.inches  = this.inches + d2.inches;

            if(ans.inches >= 12)
            {
                ans.Feet += ans.inches / 12; //feet madhe convert
                ans.inches = ans.inches % 12;// bakiche inch madhe
            }
            return ans;
        }

            void displayDistance()
           {
             System.out.println("Feet: " + Feet + " Inches: " + inches);
           }
     
}

class program289 
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        Distance d1  = new Distance();
        Distance d2  = new Distance();

         System.out.print("Enter first feet: ");
        d1.Feet = sc.nextInt();

        System.out.print("Enter first inches: ");
        d1.inches = sc.nextInt();

        System.out.print("Enter second feet: ");
        d2.Feet = sc.nextInt();


         System.out.print("Enter second inches: ");
         d2.inches = sc.nextInt();


         Distance sum = d1.addDistance(d2);

        System.out.println("Total distance is:");
        sum.displayDistance();

    }
}