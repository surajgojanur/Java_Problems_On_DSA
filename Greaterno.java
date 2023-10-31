import java.util.*;

class Greaterno{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter b number:");
        int n3=sc.nextInt();
        int n4 = n+n3;
        if(n4%2==0){
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}