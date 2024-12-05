package mypack1;
import java.util.Scanner;
import All_Packs.My_Utils;

import mypack1.Person;
public class Person_Main {
	Scanner sc=new Scanner(System.in);
	public static My_Utils ob1=new My_Utils();
	static Person p=new Person();
	void toRunSetter() {
		System.out.println("Enter the id number");
		p.setId(sc.nextInt());
		String temp=sc.nextLine();
		
		System.out.println("Enter the name");
		p.setName(sc.nextLine());
		
		
		System.out.println("Enter the city");
		p.setCity(sc.nextLine());
		System.out.println("Enter the salary");
		p.setSalary(sc.nextInt());
	}

	void toRunGet() {
		System.out.println("Name = "+p.getName());
		System.out.println("\nid = "+p.getId());
		System.out.println("\nCity = "+p.getCity());
		System.out.println("\nSalary= "+p.getSalary());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_Main p1=new Person_Main();
		p1.toRunSetter();
		
		Person_Main p2=new Person_Main();
		p2.toRunSetter();
		p1.toRunGet();
		p2.toRunGet();
		
		
		

	}

}
