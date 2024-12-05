package mypack1;

public class TriangleCal implements Shape{
	public void rectangleCalculate(double base,double height) {
		System.out.println("Area of triangle = "+(base*height)/2);
	}
	public static void main() {
		TriangleCal ob1=new TriangleCal();
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void triCalculate() {
		// TODO Auto-generated method stub
		
	}
	
}
