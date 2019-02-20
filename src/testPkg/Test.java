package testPkg;

public class Test {
int id =1000;
static int i=1000;
 public static void main(String[] a ) {
		//int b=100;
		//System.out.println("b="+b);
		Test t=new Test();
		System.out.println(t.id);
		t.m1();
	
		
	}
 
 static void m1() {
	   int a=1000;
	   Test t=new Test();
	 System.out.println(t.id);
 }

}
