package testPkg;

import java.util.Scanner;

public class IfElseStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int input=sc.nextInt();
		int a=10;
		int b=2;
		if(input==1) {
			int c=a+b;
			System.out.println("addition="+c);
		}
		else if(input==2) {
			int c=a-b;
			System.out.println("subtraction="+c);
		}
		else if(input==3) {
			int c=a*b;
			System.out.println("multiplication"	+ "="+c);
		}
		else if(input==4) {
			int c=a/b;
			System.out.println("divsion"	+ "="+c);
		}
		else {
				System.out.println("PLease enter valid number");
		}


	}
}