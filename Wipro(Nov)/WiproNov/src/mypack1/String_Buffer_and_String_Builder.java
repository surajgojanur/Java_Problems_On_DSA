package mypack1;
import All_Packs.My_Utils;
public class String_Buffer_and_String_Builder {
public static My_Utils ob1=new My_Utils();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stb=new StringBuffer("Suraj");
		ob1.println("Before append");
		ob1.print("\n  "+stb);
		stb.append(" has done the work");
		ob1.println("\nAfter append \n"+stb);
		stb.insert(0, "this add on at the zero index ");
		ob1.println("\nAfter appending at zero index ");
		ob1.println("\n "+stb);
		
		
		StringBuilder stringBuilder=new StringBuilder("\nThis is String Buidler");
		ob1.println("\\nBefore append");
		ob1.println("\n "+stringBuilder );
		stringBuilder.append(" this is an add on");
		ob1.println("\nAfter append");
		ob1.println("\n "+stringBuilder );
		
		stringBuilder.insert(0, "this add on at the zero index");
		ob1.println("\nAfter appending at zero index ");
		ob1.println("\n "+stringBuilder );
		
	}

}
