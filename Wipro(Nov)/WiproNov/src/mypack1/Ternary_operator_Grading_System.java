package mypack1;

import java.util.Scanner;

public class Ternary_operator_Grading_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the marks of student");
		int marks=sc.nextInt();
		String result;
		result = (marks>35) ? (result="passed") :(result="failed");
		System.out.println("Student has "+result+" Exam ");

	}

}
