package mypack1;
import java.util.*;
public class Binary_2_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an binary that will be converted into octal");
		long binary_number=sc.nextInt();
		long octResult = 0 ,pos =1;
		while(binary_number>0) {
			long grp=binary_number%1000;
			long decVal=0,p=0;
			while(grp>0) {
				decVal += (grp%10) * Math.pow(2, p);
				grp /= 10;
				p++;
			}
			octResult += decVal*pos;
			binary_number /= 1000;
			pos *= 10;
			
		}
		System.out.println("Octal = "+octResult);
		

	}

}
