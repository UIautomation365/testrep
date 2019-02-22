package testPkg;

public class ThisToPassMathod {
	public static void main(String args[]) {
		Example e=new Example();
		e.m2();
	}

}
class Example{
	static void m1(Example e) {
		System.out.println(e.getClass());
		System.out.println("m1");
		e.m3();
	}
	void m2() {
		m1(this);
	}
	void m3() {
		System.out.println("m3");
		
	}
}
