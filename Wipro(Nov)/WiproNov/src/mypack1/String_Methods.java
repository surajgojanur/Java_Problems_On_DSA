package mypack1;
import All_Packs.My_Utils;

public class String_Methods {
	public static My_Utils ob1=new My_Utils();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String("suraj");
		String s2=new String("suraj");
		String s3=new String("SURAJ");
		String s4=("suraj");
		String s5=("suraj");
		String s6=("SURAJ");
		String s7=new String("SURAJ").intern();
		String s8=("SURAJ").intern();
		
		//Unicode of that char point
		ob1.println("This above code represents char at 0 index of "+s1+"\t");
		System.out.print(s1.codePointAt(0));
		
		ob1.println("\nThis above code represents char at 0 index of "+s3+"\t");
		System.out.print(s3.codePointAt(0));
		
		//Compare to method
		ob1.println("\nComparing s1 to s2 "+s1.compareTo(s2));
		ob1.println("\nComparing s2 to s1 "+s2.compareTo(s1));
		ob1.println("\nComparing s1 to s4 "+s1.compareTo(s4));
		ob1.println("\nComparing s4 to s1 "+s4.compareTo(s1));
		
		//equals Method
		ob1.println("\nEquals method s1 to s2\t"+s1.equals(s2));
		ob1.println("\nEquals method s2 to s1\t"+s2.equals(s1));
		ob1.println("\nEquals method s1 to s4\t"+s1.equals(s4));
		ob1.println("\nEquals method s4 to s1\t"+s4.equals(s1));
		
		//Comparison Method in string
		ob1.println("\nComparing s1 to s2\t"+(s1==s2));
		ob1.println("\nComparing s1 to s4\t"+(s1==s4));
		ob1.println("\nComparing String Intern s7 to s8\t"+(s7==s8));
		
		//Contains method
		ob1.println("\nChecking weather s1 contains s2\t"+s1.contains(s2));
		ob1.println("\nChecking weather s1 contains s4\t"+s1.contains(s4));

	}

}
