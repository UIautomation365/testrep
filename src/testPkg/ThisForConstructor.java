package testPkg;

public class ThisForConstructor {
	public static void main(String args[]) {
		MyTest t=new MyTest();
		//MyTest t1=new MyTest(20);
		//MyTest t2=new MyTest(20,30);
		
	}

}


class MyTest{
	MyTest(){
		this(10);
		System.out.println("This is zero args constractor");
	}
	MyTest(int i){
		this(10,20);
		System.out.println("1 args");
	}
	MyTest(int i, int j){
		//this();
		System.out.println("2 args");
	}
	
}
