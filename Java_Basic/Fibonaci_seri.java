import java.util.Scanner;
public class Fibonaci_seri{
    public void generateFibo(int n){
        if(n<=0){
            System.out.print("Please Enter bigger than 0");
        }
        int[] fibos=new int[n];
        fibos[0]=1;
        if(n>1){
            fibos[1]=1;
        }
        for(int i=2;i<n;i++){
            fibos[i]=fibos[i-1]+fibos[i-2];
        }
        System.out.println("Fibo series :");
        for(int num:fibos){
            System.out.print(num+"\n");
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        Fibonaci_seri fb=new Fibonaci_seri();
        fb.generateFibo(n);
        sc.close();
    }
} 