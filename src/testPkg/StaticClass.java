package testPkg;

public class StaticClass {
	public static void main(String args[]) {
		Outer.Inner.msg();
	}

}

class Outer{
	static class Inner{
		static void msg() {
			System.out.println("inner class method");
		}
	}
}
