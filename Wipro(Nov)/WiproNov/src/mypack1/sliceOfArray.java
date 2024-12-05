package mypack1;

import java.util.Scanner;

public class sliceOfArray {
	void arraySlice(int[] ar1,int st,int end){
		if(st>end || ar1.length<end || st<0) {
			System.out.println("Invalid input");
		}
		int[] result=new int[end=st+1];
		int ct=0;
		for(int i=st;i<=end;i++) {
			result[ct]=ar1[i];
			ct++;
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sliceOfArray ob1=new sliceOfArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of eemts that u wnat to push");
		int n=sc.nextInt();
		int[] ar1=new int[n];
		for(int i=0;i<n;i++) {
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter strting numbe of slice array");
		int st=sc.nextInt();
		System.out.println("Enter ending numbe of slice array");
		int end=sc.nextInt();
		ob1.arraySlice(ar1, st, end);
		
		
		
	}

}
