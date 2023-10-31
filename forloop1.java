import java.util.*;

class forloop1{
    public static void main(String args[])
    {
        int i;
        int[] a=new int[51];
        for(i=0;i<51;i++){
            a[i]= i*2;
            
            
            if(a[i]==100){
                break;
            }


        }
        for(i=50;i<51;i--){
System.out.println(a[i]);
if(a[i]==0){
    break;
}
        }
    }
}