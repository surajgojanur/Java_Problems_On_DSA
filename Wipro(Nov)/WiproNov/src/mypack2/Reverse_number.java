package mypack2;

public class Reverse_number {

	public int reverse(int n) {
		int result=0;
		String rev="";
		String n1=Integer.toString(n);
		for(int i=n1.length()-1;i>=0;i--) {
			rev+=n1.charAt(i);
		}
		result=Integer.parseInt(rev);
		
		return result;
	}
}
