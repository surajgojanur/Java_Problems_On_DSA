package mypack1;

import java.util.Scanner;

public class AddScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers do u want to add");
		int n=sc.nextInt();
		int total=0;
		for(int i=0;i<n;i++) {
			total += sc.nextInt();
		}
		System.out.println("You have enterd "+n+" total is = "+total);

	}

}
