class Swap_a_number_without_thrid_no{
    public void swap(int a,int b){
        b=b+a;
        a=b-a;
        b=b-a;

        System.out.println(a+" "+b);

    }
    public static void main(String args[]){
        Swap_a_number_without_thrid_no st=new Swap_a_number_without_thrid_no();
        int a=1;
        int b=2;
        System.out.println(a+" "+b);
        st.swap(a,b);
    }
}