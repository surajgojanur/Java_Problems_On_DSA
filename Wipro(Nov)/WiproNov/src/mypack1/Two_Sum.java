package mypack1;
import All_Packs.My_Utils;

public class Two_Sum {
public static My_Utils ob1=new My_Utils();
	
static Two_Sum ob2=new Two_Sum();
	public String find_two_elements(int[] ar1,int target) {
		
		String result="\nResult = ";
		for(int i=0;i<ar1.length-1;i++) {
			for(int j=i+1;j<ar1.length;j++) {
				if(ar1[i]*ar1[j]==target) {
					result=Integer.toString(ar1[i])+" "+Integer.toString(ar1[j]);
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch=1;
		while(ch!=2) {
			ob1.println("\nTo Find elements of which form product of two elemts");
			ch=ob1.readInt("\n1.Enter"
					+ "\n2.Exit");
			if(ch==2) {
				break;
			}
			int n=ob1.readInt("Enter the how many elemts do u need");
			int[] ar1=new int[n];
			for(int i=0;i<n;i++) {
				ar1[i]=ob1.readInt("Enter Element "+i);
			}
			int target=ob1.readInt("Enter the sum of two product");
		
			ob1.println(" Two Elements "+ob2.find_two_elements(ar1, target)+"\n");
		}
	}

}
