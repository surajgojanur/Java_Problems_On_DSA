package mypack1;

import java.util.Scanner;

public class Program_2_add_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0,m=0;
		
		System.out.println("Enter the row size of first array ");
		n=sc.nextInt();
		
		System.out.println("Enter the colum size of first array ");
		m=sc.nextInt();
		
		int[][] array1=new int[n][m];
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[0].length;j++) {
				array1[i][j]=sc.nextInt();
			}
		}
		
		//second array insertion 
		
		System.out.print("~~~~Enter the values for second array with sae row and colum~~~~\n");
		
		int[][] array2=new int[n][m];
		for(int i=0;i<array2.length;i++) {
			for(int j=0;j<array2[0].length;j++) {
				array2[i][j]=sc.nextInt();
			}
		}
		//Display of first array
		System.out.print("~~~~Display for first array~~~~\n");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[0].length;j++) {
				System.out.print(array1[i][j]+"\t");
			}
			System.out.println();
		}
		
		//Display of Second array
				System.out.print("~~~~Display for Second array~~~~\n");
				for(int i=0;i<array2.length;i++) {
					for(int j=0;j<array2[0].length;j++) {
						System.out.print(array2[i][j]+"\t");
					}
					System.out.println();
				}
				
				//To store the Addition of both the arrays
				int[][] array3=new int[n][m];
				
				//To add both the arrays
				System.out.print("~~~~Addition of both the arrays~~~~\n");
				for(int i=0;i<array2.length;i++) {
					for(int j=0;j<array2[0].length;j++) {
						System.out.print(array1[i][j]+array2[i][j]+"\t");
					}
					System.out.println();
				}
				
				
		

	}

}
