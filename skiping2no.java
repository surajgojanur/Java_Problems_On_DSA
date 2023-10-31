import java.util.*;
class skiping2no{
    public static void main(String args[])
    {
        int i=1;
        int j=0;
        int[] a=new int[100];
        while(i<101){
            
            a[j]=i;
            j = j+1;
            i=i+3;
        }
        for(i=0;i<100;i++)
        {
            System.out.println(a[i]);
            if(a[i]==100){
                break;
            }
        }
    }
}