package mypack1;
import All_Packs.My_Utils;
public class StrLength {
public static My_Utils ob1=new My_Utils();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st=ob1.readString("Enter string\t");
		boolean check=false;
		int count=0;
		while(check==false) {
			try {
				st.charAt(count);
				count++;
			}
			catch(Exception e){
				check=true;
			}
			finally{
				
			}
		}
		ob1.println("the String has length of "+(count));
	}

}
