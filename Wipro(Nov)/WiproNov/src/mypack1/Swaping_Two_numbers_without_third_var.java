package mypack1;

import java.util.Scanner;

public class Swaping_Two_numbers_without_third_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 'a' = ");
		int a=sc.nextInt();
		System.out.println("Enter number 'b' = ");
		int b=sc.nextInt();
		System.out.println("number 'a' = "+a+" and number b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swaping");
		System.out.println("number 'a' = "+a+" and number b = "+b);

	}

}
