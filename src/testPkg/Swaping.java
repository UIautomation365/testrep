package testPkg;

public class Swaping {
	public static void main(String[] args) {
		int a=10;
		int b=20;
	    int tmp;
	    tmp=a;
	    a=b;
	    b=tmp;
	    
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    
	    System.out.println("a="+a+"  "+"b="+b);
	}

}
