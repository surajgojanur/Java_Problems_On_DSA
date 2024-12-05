package Main_pack_for_all_in_one;
import All_Packs.All_fun;
import All_Packs.My_Utils;

public class Main_class {
	public static My_Utils ob1=new My_Utils(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		All_fun ob2=new All_fun();
		int case1=1;
		do {
			ob1.println("Which action do you wnat to perform\n");
			ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			ob1.println("\n1.Addition_of_numbers_using_Scanner \n"
					+ "2.binary_to_decimal "
					+ "\n3.n_Prime_Numbers"
					+ "\n4.add_Two_Matrix"
					+ "\n5.simpe_Calculator"
					+ "\n6.sorting_Array"
					+ "\n7.Student Grading System"
					+ "\n8.Linear Search"
					+ "\n0.Exit");
			case1=ob1.readInt("\nEnter your choice");
			switch(case1) {
			case 1:
				ob2.Addition_of_numbers_using_Scanner();
				ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
			case 2:
				ob2.binary_to_decimal();
				ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
			case 3:
				ob2.n_Prime_Numbers();
				ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
			case 4:
				ob2.add_Two_Matrix();
				ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
			case 5:
				ob2.simpe_Calculator();
				ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
			case 6:
				ob2.sorting_Array();
				ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
				
			case 7:
				ob2.Student1();
				ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
			case 8:
				ob2.Linear_Search();
				ob1.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				break;
			
			}
			
			
		}while(case1!=0);
		
		
		
		
		
		
		
		
		
	}

}
