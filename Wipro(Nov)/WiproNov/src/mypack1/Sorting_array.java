package mypack1;

import java.util.Scanner;

public class Sorting_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements do u want to insert in an array ");
		int n=sc.nextInt();
		int[] array1=new int[n];
		for(int i=0;i<n;i++) {
			array1[i]=sc.nextInt();
		}
//		System.out.println("~~~~~~~~~You have inserted elements into array~~~~~~~~~");
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int temp=0;
				if(array1[j]>array1[i]) {
					temp=array1[j];
					array1[j]=array1[i];
					array1[i]=temp;
				}
			}
		}
		System.out.println("\n \n \n ~~~~~~~~~~~~~~~~~Sorted Array~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<n;i++) {
			System.out.println(array1[i]);
		}
		
	}

}
