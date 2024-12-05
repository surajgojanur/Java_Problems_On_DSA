package mypack1;
import All_Packs.My_Utils;
public class Linear_search {
public static My_Utils ob1=new My_Utils();  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=ob1.readInt("Please enter number of elemts that u wnat to insert");
		int[] ar1=new int[n];
		for(int i=0;i<n;i++) {
			ar1[i]=ob1.readInt("Enter elemt"+i+" ");
		}
		int find_element=ob1.readInt("Enter the element that u wnat to find");
		//Linear sorting
		for(int i=0;i<n;i++) {
			if(ar1[i]==find_element) {
				ob1.println("Element "+find_element+" found at "+i);
			}
		}
	}

}
