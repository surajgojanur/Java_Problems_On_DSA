package mypack1;
import All_Packs.My_Utils;

public class BinDecOct {
	int binary_to_decimal(int n) {
		String st=Integer.toString(n);
		int power=0;
		int result=0;
		
		for(int i=st.length()-1;0<=i;i--) {
			int temp=(int) Math.pow(2, power);
			power++;
			if(temp==0) {
				temp=1;
			}
			result+=temp*Character.getNumericValue(st.charAt(i));
		}
		return result;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinDecOct ob1=new BinDecOct();
		My_Utils ob2=new My_Utils(); 
		int n=ob2.readInt("PLease Enter number");
		System.out.print(ob1.binary_to_decimal(n));
		
	}

}
