import java.util.Scanner;

class recursion_n{

    public static void sum_n(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sum_n(i+1,n,sum);
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        // Recursion of sum of n natural numberes
        Scanner sc=new Scanner(System.in);
        sum_n(1,5,0);
        sc.close();
    }
}