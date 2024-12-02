package mypack1;
import All_Packs.My_Utils;
public class Bubble_sort {

	public static My_Utils ob1=new My_Utils();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=ob1.readInt("Enter how many elements u want u insert");
		int[] arr1=new int[n];
		for(int i=0;i<n;i++){
				arr1[i]=ob1.readInt("Enter element "+i);
	}
		int temp=0;
		//Bubble sort
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr1[j]>arr1[i]) {
					temp=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=temp;
				}
			}
		}
		
		//printing sortedd array
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}

}
}