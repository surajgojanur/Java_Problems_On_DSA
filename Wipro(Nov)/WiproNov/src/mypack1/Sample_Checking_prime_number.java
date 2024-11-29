package mypack1;

import java.util.Scanner;

public class Sample_Checking_prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
		System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");
	}

}
