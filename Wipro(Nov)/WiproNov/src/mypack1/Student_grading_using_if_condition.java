package mypack1;

import java.util.Scanner;

public class Student_grading_using_if_condition {
	Scanner sc=new Scanner(System.in);
	
	public void student1() {
		System.out.print("Enter the Student Name");
		String student_name=sc.nextLine();
	
		System.out.print("Enter the "+student_name+" Marks in Science");
		int science=sc.nextInt();
		
		System.out.print("Enter the "+student_name+" Marks in social");
		int social=sc.nextInt();
		
		System.out.print("Enter the "+student_name+" Marks in mathmatics");
		int math=sc.nextInt();
		
		System.out.print("Enter the "+student_name+" Marks in English");
		int english=sc.nextInt();
		
		int total=(science+social+math+english)*100/400;
		
		if(total>90) {
			System.out.print(student_name+" has scored A grade");
		}
		else if(80<total && total<90) {
			System.out.println(student_name+" has scored B grade");
		}
		else if(70<total && total<80) {
			System.out.println(student_name+" has scored C grade");
		}
		else if(60<total && total<70) {
			System.out.println(student_name+" has scored D grade");
		}
		else if(35<total && total<60) {
			System.out.println(student_name+" has Passed ");
		}
		else if(total<35) {
			System.out.println(student_name+" has Failed");
		}
	}

	public static void main(String[] args) {
		Student_grading_using_if_condition stunt1=new Student_grading_using_if_condition();
		stunt1.student1();
	}

}

