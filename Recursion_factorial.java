import java.util.*;
class Recursion_factorial{
    //recursion factorial
    public static int sumFact(int n){
        if(n==0 || n==1)
        {
            System.out.print("1");
            return 1;
        }
        int n1=sumFact(n-1);
        int fact =n * n1;
        System.out.println(fact);
        return fact;
    }
    public static void main(String args[])
    {
        int result =sumFact(5);
    }
}