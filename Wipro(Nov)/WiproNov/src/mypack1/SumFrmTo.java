package mypack1;

import java.util.Scanner;

public class SumFrmTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start numner and end number to from sum");
		int st=sc.nextInt();
		int end=sc.nextInt();
		int result=0;
		boolean ck=false;
		if(st<end) {
			ck=true;
		for(int i=st;i<=end;i++) {
			result+=i;
		}
		}
		else {
			System.out.println("start number is bigger thatn ending number");
		}
		if(ck==true) {
			System.out.println("Sum is = "+result);
		}

	}

}
