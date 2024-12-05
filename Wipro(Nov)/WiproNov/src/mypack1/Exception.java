package mypack1;
class noteligible extends Exception{
	public noteligible() {
		
	}
}
public class Exception {

	public static void eligible(int n)throws noteligible {
		if(n<18) {
			throw new noteligible();
		}
		else {
			System.out.print("eligble");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=19;
		
		try {
			eligible(n);
		}
		catch(noteligible e) {
			System.out.println("Not eligible");
		}
	}

}
