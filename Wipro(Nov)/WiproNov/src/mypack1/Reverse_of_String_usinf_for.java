package mypack1;

import All_Packs.My_Utils;

public class Reverse_of_String_usinf_for {
	public static My_Utils ob1=new My_Utils();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="yob doog a era ruoY";
		ob1.println("Before reverse\n");
		ob1.println(""+st);
//		String stb="";
		StringBuilder stb=new StringBuilder();
		for(int i=st.length()-1;i>=0;i--) {
//			stb+=st.charAt(i);
			stb.append(st.charAt(i));
//			ob1.println("adding");
		}
		ob1.println("\nAfter reverse\n");
		//Printing reverse of string
		ob1.println(""+stb);

	}

}
