package mypack3;
import mypack2.Reverse_number;

import java.util.*;
public class To_call_reverse  {
	
//	public int reverse(int n) {
//		int result=0;
//		String rev="";
//		String n1=Integer.toString(n);
//		for(int i=n1.length()-1;i>=0;i--) {
//			rev+=n1.charAt(i);
//		}
//		result=Integer.parseInt(rev);
//		
//		return result;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Reverse_number ob=new Reverse_number();
		int n=sc.nextInt();
		int m=ob.reverse(n);
		System.out.print(m);
		 
	}

}
