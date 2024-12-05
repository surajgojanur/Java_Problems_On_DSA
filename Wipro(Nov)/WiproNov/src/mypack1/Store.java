package mypack1;


class Book {
	int price;
	String book_name;
	String autherName;
	void setBooks(int price,String book_name,String autherName) {
		this.price=price;
		this.book_name=book_name;
		this.autherName=autherName;
	}
	void displayBooks() {
		System.out.println("Book name : "+this.book_name);
		System.out.println("Price : "+this.price);
		System.out.println("Auther : "+this.autherName);
	}
	void coomonMethod1() {
		System.out.println("Auther : "+this.autherName);
	}
}
class Auther extends Book{
	String books;
	String autherName;
	void setAuther(String books,String autherName) {
		this.books=books;
		this.autherName=autherName;
	}
	void displayAuther() {
		System.out.println("Auther : "+this.autherName);
		System.out.println("books writen : "+this.books);
	}
	void coomonMethod1() {
		System.out.println("Books :"+this.books);
		System.out.println("Auther name :"+this.autherName);
	}
}
public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auther b2=new Auther();
		b2.setBooks(300, "Harry Porter", "James Gosling");
		b2.setAuther("Harry Porter","Dumble Door");
		b2.displayBooks();
		b2.displayAuther();
		
		b2.coomonMethod1();

	}

}
