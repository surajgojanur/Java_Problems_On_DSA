package mypack1;

import All_Packs.My_Utils;

public class Binay_serach {
	public static My_Utils ob1=new My_Utils();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=ob1.readInt("Please enter number of elemts that u wnat to insert");
		int[] ar1=new int[n];
		for(int i=0;i<n;i++) {
			ar1[i]=ob1.readInt("Enter elemt"+i+" ");
		}
		int temp=0;
		//first sorting with bubble sort
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar1[j]>ar1[i]) {
					temp=ar1[j];
					ar1[j]=ar1[i];
					ar1[i]=temp;
				}
			}
		}
		
		//Sorted array
		ob1.println("This is sorted array \n");
		for(int i=0;i<n;i++) {
			System.out.println(ar1[i]);
		}
		
		//Binary Search
		int right=n-1;
		int left=0;
		int mid=0;
		boolean ct=false;
		int fd=ob1.readInt("enter the element that u wnat to find");
		while(left<right) {
			mid=(right+left)/2;
			
			if(ar1[mid]==fd) {
				ob1.println("Element dound at "+mid);
				ct=true;
				break;
			}
			else if(ar1[mid]>fd) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
			
		}
		if(ct==false) {
			ob1.println("Element "+fd+" was not found");
			}

	}

}
