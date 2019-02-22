package testPkg;

public class ThisForInstanceVariable {
	public static void main(String [] args ) {
		emp e =new emp();
		e.setData(20, "ajay", 10000);
		e.printData();		
	}

}
class emp{
	int eid;
	String ename;
	int esal;
	void setData(int eid,String ename,int esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	void printData() {
		setData(10, "ajit",12334);
		System.out.println("emp ID="+eid+" "+" emp name="+ename+" "+"emp salary"+esal);
	}
}