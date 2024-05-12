import java.util.Scanner;

class Prime_number{
    public boolean isPrime(int n){
        if (n==0 || n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]) {
        Prime_number pm=new Prime_number();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check is it prime or not  ");
        int n=sc.nextInt();
        System.out.println("Answer  :" +pm.isPrime(n));
        sc.close();
    }
}