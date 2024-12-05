package mypack1;
import All_Packs.My_Utils;

public class Two_fun {
public static My_Utils ob1=new My_Utils(); 
	public void null_Fun(String msg) {
		ob1.println(msg);
	}
	public int read_number(int n) {
		
		return n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Two_fun ob2=new Two_fun();
		ob2.null_Fun(ob1.readString("Enter an string\t"));
		int r2=ob2.read_number(ob1.readInt("\nEnter an numebr\t"));
		ob1.println(" "+r2);

	}

}
