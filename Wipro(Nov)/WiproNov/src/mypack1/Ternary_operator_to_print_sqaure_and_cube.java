package mypack1;

import java.util.Scanner;

public class Ternary_operator_to_print_sqaure_and_cube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter an number");
		int n=sc.nextInt();
		String result=(n%2==0) ? (result="passed") : (result="failed");
		System.out.println("Result = "+result);
	}

}
