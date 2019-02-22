package testPkg;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String ares[]) {
		Scanner scr=new Scanner(System.in);
		int option;
		int a=10;
		int b=20;
		int c;
		do {
		System.out.println("Enter your choice between 1 to 4");
		 option=scr.nextInt();
		}
		while(option<=1 && option>=4);
		switch (option) {
		case 1:
			c=a+b;
			System.out.println("addition is "+c);
			break;
		case 2:
			c=a-b;
			System.out.println("subtraction is "+c);
			break;
		case 3:
			c=a*b;
			System.out.println("multiplicution is "+c);
			break;
		case 4:

			c=a/b;
			System.out.println("division is "+c);
			break;


		default:
			break;
		}
	}

}
