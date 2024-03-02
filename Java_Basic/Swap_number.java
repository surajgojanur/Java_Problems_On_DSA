class Swap_number{
    public void swap(int a,int b){
        int c=a;
        int d=b;
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.print("A="+c+"B"+d);
    }
    public static void main(String args[]){
        int a=1;
        int b=2;
        Swap_number p=new Swap_number();
        p.swap(a,b);
    }
}