package testPkg;

import java.io.BufferedReader;
import java.util.Scanner;

public class SwitchCaseStat {
	public static void main(String args[]) {
		int a=10;
		int b=2;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option");
		String option1=sc.nextLine();
		System.out.println(option1);
		int option=6;
		//String str="ajay";
		switch (option) {
		case 1:
			c=a+b;
			System.out.println("Addition is "+c);
			break;
		case 2:
			 c=a-b;
			System.out.println("subtraction is "+c);
			break;
		case 3:
			 c=a*b;
			System.out.println("multiplication is "+c);
			break;
		case 4:
			 c=a*b;
			System.out.println("divsion is "+c);
			break;
			

		default:
			System.out.println("please Enter valid option");
			break;
		}
		
		

	}
}
