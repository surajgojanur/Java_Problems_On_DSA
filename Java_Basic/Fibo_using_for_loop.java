class Fibo_using_for_loop{
    public void Fib(int n){
        int a=0;
        int b=1;
        int c=1;
        System.out.print("Here it comes:\n"+"0"+"\n");
        for(int i=0;i<n;i++){
            System.out.println(b);
            a=b;
            b=c;
            c=a+b;

        }
    }
    public static void main(String[] args) {
        Fibo_using_for_loop fb=new Fibo_using_for_loop();
        fb.Fib(7);
    }
}