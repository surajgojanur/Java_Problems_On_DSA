package mypack1;
import All_Packs.My_Utils;

public class Person {
	public static My_Utils ob1=new My_Utils();
	private int id;
	private String name;
	private String city;
	private int salary;
	
	void display() {
		System.out.println("id number = \n"+this.id);
		System.out.println("name  = \n"+this.name);
		System.out.println("city = \n"+this.city);
		System.out.println("salary  = \n"+this.salary);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	

}
