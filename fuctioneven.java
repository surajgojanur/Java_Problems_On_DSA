import java.util.*;
class fuctioneven{

    public static int iseven(int n1){
    
        if(n1 % 2 == 0){
            return 1;
        }
        else{
            return 2;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int result= iseven(n);
        System.out.println("result:"+result);

    }
}