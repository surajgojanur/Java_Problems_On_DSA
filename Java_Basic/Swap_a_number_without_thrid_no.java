class Swap_a_number_without_thrid_no{
    public void swap(int a,int b){
        int b=b+a;
        int a=b-a;
        int b=b-a;

        System.out.println(a+" "+b);

    }
    public static void main(String args[]){
        Swap_a_number_without_thrid_no st=new Swap_a_number_without_thrid_no();
        int a,b=1,2;
        System.out.println(a+" "+b);
        Swap_a_number_without_thrid_no.swap(a,b);
    }
}