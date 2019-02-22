package testPkg;

public class ReturnThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myTest2 t=new myTest2();
		myTest2 t2=t.m1();
		t2.m2();

	}
	
	

}

class myTest2{
	myTest2 m1() {
		return this;
	}
	void m2() {
		System.out.println("m2");
	}
}
