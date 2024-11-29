package mypack1;

import java.util.Scanner;

public class Nth_Prime_numbers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter till how many prime numbers u need");
		int n=sc.nextInt();
		int count=0;
		for(int x=1;x<=n;x++) {
		count=0;
		for(int i=1;i<=n;i++) {
			
			if(x%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(x+" is a Prime Number");
		}
		else {
			System.out.println(x+" is Not a Prime Number");
		}
	}
	}

}
