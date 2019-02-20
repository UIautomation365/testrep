package testPkg;

import java.util.ArrayList;

public class DoWhileLoop {
	public static void main(String args[]) {
		DoWhileLoop dw=new DoWhileLoop();
		dw.printNumber();
	}
	
	void printNumber() {
		int i=5;
		do {
			
			System.out.println(i);
			i++;
		}while(false);
		
		ArrayList<String> arr=new ArrayList<>();
		arr.add("ajjay");
		arr.add("amit");
		int [] a= {1,2,3};
		
		
		for (int x: a) {
			System.out.println(x);
			
		}
	}

}
