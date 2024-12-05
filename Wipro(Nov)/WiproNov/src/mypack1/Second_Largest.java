package mypack1;
import All_Packs.My_Utils;

public class Second_Largest {
	public static My_Utils ob1=new My_Utils();	
	public int second_Largest(int[] ar1) {
		int largest=ar1[0];
		int second_largest=ar1[1];
		if(ar1[0]>ar1[1]) {
			int temp=ar1[1];
			ar1[1]=ar1[0];
			ar1[0]=temp;
		}
		for(int i=2;i<ar1.length;i++) {
			if(ar1[i]>second_largest && ar1[i]<largest) {
				second_largest=ar1[i];
			}
			if(ar1[i]>second_largest && ar1[i]>largest) {
				largest=ar1[i];
			}
		}
		return second_largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second_Largest ob2=new Second_Largest();
		int n=ob1.readInt("Enter how many elements that u want to enter");
		int[] ar1=new int[n];
		for(int i=-0;i<n;i++) {
			ar1[i]=ob1.readInt("Enter element "+i);
		}
		ob1.println(" Second largest numebr = "+ob2.second_Largest(ar1));

	}

}
