package testPkg;

public class StaticVariable {
	static {
		System.out.println("Welcome to static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int[] a=new int[0];
		System.out.println("main start");
		
		testStatic t=new testStatic();
		t.printData();
		testStatic t2=new testStatic();
		t2.printData();
		testStatic t3=new testStatic();
		t3.printData();

	}
}

class testStatic{
	static int a=10;
	int b=10;
	
	
	void printData() {
		a+=1;
		b+=1;
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
	
}
