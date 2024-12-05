package mypack2;

interface Shape{
	double calculate();
}

class Triangle implements Shape{
	private double base;
	private double height;
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}
}
class Reactangle implements Shape{
	private double length;
	private double width;
	public Reactangle(double length,double width) {
			
	}
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}



public class Circle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
