package mypack1;
import java.util.Scanner;

import All_Packs.My_Utils;

public class Book_Details {
	public static My_Utils ob1= new My_Utils();
	public static Scanner sc=new Scanner(System.in);
	int id,price;
	String name;
	
	static String store;
	
	void get() {
		this.id=ob1.readInt("Enter the Student Id");
		ob1.println("Enter book name");
		this.name=sc.nextLine();
		store=ob1.readString("\nEnter the store name please");
	}
	void dsiplay() {
		ob1.println("Name \n "+this.name);
		ob1.println(" id \n"+this.id);
		ob1.println(" price \n"+this.price);
		
		ob1.println(" store \n"+store);
	}
	void price(){
		this.price=ob1.readInt("Enter the price of the book for "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_Details  book1=new Book_Details();
		book1.get();	book1.price(); 		book1.dsiplay();
		Book_Details  book2=new Book_Details();
		book2.get();	book2.price(); 		book2.dsiplay();
		Book_Details  book3=new Book_Details();
		book3.get();	book3.price(); 		book3.dsiplay();
		

	}

}
