package All_Packs;

import java.util.Scanner;

public class My_Utils {

	public static final Scanner sc=new Scanner(System.in);
	
	public static void print(String msg) {
		System.out.print(msg);
	}
	public static void println(String msg) {
		System.out.print(msg);
	}
	
	//To Read String
	public static String readString(String message) {
		print(message);
		return sc.nextLine();
	}
	public static int readInt(String message) {
		print(message);
		return sc.nextInt();
	}
	public static Double readDouble(String message) {
		print(message);
		return sc.nextDouble();
	}
	public static Long readLong(String message) {
		print(message);
		return sc.nextLong();
	}
	
}
