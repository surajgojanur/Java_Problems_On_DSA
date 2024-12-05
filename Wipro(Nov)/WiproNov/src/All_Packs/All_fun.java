package All_Packs;
import All_Packs.My_Utils;

import java.util.Scanner;

public class All_fun {
	public static My_Utils ob1=new My_Utils();
	
	
	public void Addition_of_numbers_using_Scanner() {
	int n=ob1.readInt("Please enter how many number u want to add");
	int total=0;
	for(int i=0;i<n;i++) {
		total += ob1.readInt("Enter number "+i);
	}
	System.out.println("You have enterd "+n+" total is = "+total);
}
	//Binary to decimal
	public void binary_to_decimal() {
		long binary_number=ob1.readLong("Enter an binary that will be converted into octal");
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
	
	//n_Prime_Numbers
	public void n_Prime_Numbers() {
		int n=ob1.readInt("How many prime numbers do you wnat to print");
		int count=0;
		for(int i=1;i<n;i++) {
			count=0;
			for(int j=i;j<n;j++) {
				if(i%j==0) {
					count++;
				}
				if(count==2) {
					ob1.println(i+" is prime number");
				}
			}
		}
	}
	
	//Program to add two matrix
	public void add_Two_Matrix() {
		int r=ob1.readInt("Enter the row size that u wnat ");
		int c=ob1.readInt("Enter the colum size that u wnat ");
		int[][] matrix1=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix1[i][j]=ob1.readInt("Enter the first matrix value for ["+r+"]["+c+"]");
			}
		}
		ob1.print("you have entered values for first matrix's");
		int[][] matrix2=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix2[i][j]=ob1.readInt("Enter the second matrix value for ["+r+"]["+c+"]");
			}
		}
		
		int[][] result_matrix=new int[r][c];
		//Adding two matrix's
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				result_matrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		
		//Printing sum of both the matrix array's
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print((result_matrix[i][j]));
			}
			ob1.print("\n");
		}
	}
		
		//Simple calculator
		public void simpe_Calculator(){
			int a=ob1.readInt("Enter the First numebr");
			int b=ob1.readInt("Enter second numebr");
			int ch=ob1.readInt("PLease Enter the opertaion tat u want to perform \n 1.Addition \\n 2.Subtraction \\n 3.Division \\n 4.Multiply");
			switch(ch) {
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a/b);
				break;
			case 4:
				System.out.println(a*b);
				break;
			}
			System.out.print("~~~~~~~~~~~~~~~~~END~~~~~~~~~~");
		}
		
		//Sorting an simple array
		public void sorting_Array() {
			int n=ob1.readInt("Enter the number of elements that u wnat to store in an array");
			int[] array1=new int[n];
			for(int i=0;i<n;i++) {
				array1[i]=ob1.readInt("Enter the array element "+i);
			}
			
			int temp=0;
			//sorting array
			for(int i=0;i<n-1;i++) {
				for(int j=1;j<n;j++) {
					if(array1[j]<array1[i]) {
						temp=array1[j];
						array1[j]=array1[i];
						array1[i]=temp;
					}
				}
			}
			
			//Printing sorted array
			ob1.println("Array has been sorted");
			for(int i=0;i<n;i++) {
				System.out.println(array1[i]);
			}
			
		
	}
		public void Student1(){
			
			String student_name=ob1.readString("Enter the Student Name");
			int science=ob1.readInt("Enter the "+student_name+" Marks in Science");
			int social=ob1.readInt("Enter the "+student_name+" Marks in social");
			int math=ob1.readInt("Enter the "+student_name+" Marks in mathmatics");
			int english=ob1.readInt("Enter the "+student_name+" Marks in English");
			int total=(science+social+math+english)*100/400;

			
			if(total>90) {
				ob1.println(student_name+" has scored A grade");
			}
			else if(80<total && total<90) {
				ob1.println(student_name+" has scored B grade");
			}
			else if(70<total && total<80) {
				ob1.println(student_name+" has scored C grade");
			}
			else if(60<total && total<70) {
				ob1.println(student_name+" has scored D grade");
			}
			else if(35<total && total<60) {
				ob1.println(student_name+" has Passed ");
			}
			else if(total<35) {
				ob1.println(student_name+" has Failed");
			}
			
		}
		public void Linear_Search() {
			int n=ob1.readInt("Please enter number of elemts that u wnat to insert");
			int[] ar1=new int[n];
			for(int i=0;i<n;i++) {
				ar1[i]=ob1.readInt("Enter element"+i+" ");
			}
			int find_element=ob1.readInt("Enter the element that u wnat to find");
			//Linear sorting
			for(int i=0;i<n;i++) {
				if(ar1[i]==find_element) {
					ob1.println("Element "+find_element+" found at "+i);
				}
			}
		}
}