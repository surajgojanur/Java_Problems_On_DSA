package mypack1;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<101;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("Fizz Buzz");
			}
			if(i%3==0) {
				System.out.println("Fizz");
			}
			if(i%5==0) {
				System.out.println("Buzz");
			}
		}

	}

}
