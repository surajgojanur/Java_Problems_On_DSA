package mypack1;
import java.util.Arrays;

import All_Packs.My_Utils;
public class Array_2_String {

	public static My_Utils ob1=new My_Utils(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=ob1.readInt("Enter how many elemtns u wnat in an array");
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=ob1.readInt("Enter element "+i+" ");
		}
		int start=ob1.readInt("Enter from where u wnat to slice array ");
		int end=ob1.readInt("Enter from where u wnat to End slice array ");
		
		int[] arr2=Arrays.copyOfRange(arr1, start, end);
		ob1.println("Sliced array has "+arr2.length+" elements \n");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

	}

}
