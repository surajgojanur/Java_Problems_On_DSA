package mypack1;
import java.util.*;
public class Simple_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("PLease Enter the Two number's first");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("PLease Enter the opertaion tat u want to perform");
		System.out.println("1.Addition \n 2.Subtraction \n 3.Division \n 4.Multiply");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a/b);
			break;
		case 4:
			System.out.println(a*b);
			break;
		}
		System.out.print("~~~~~~~~~~~~~~~~~END~~~~~~~~~~");
	}

}

//
