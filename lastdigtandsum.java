import java.util.*;
class lastdigtandsum{
    public static int lastsum(int n2,int n1){
        int m2=Math.abs(n2);
        int m1=Math.abs(n1);
        int n3=m2%10;
        int n4=m1%10;
        int n5=n3+n4;

        return n5;



    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n1,n2;
    System.out.println("Enter Two Numbers");
    n1=sc.nextInt();
    n2=sc.nextInt();
    int result=lastsum(n1,n2);
    System.out.println("Sum : "+result );}
}