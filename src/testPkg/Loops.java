package testPkg;

public class Loops {
	
	public static void main(String args[]) {
	      Loops l=new Loops();
	      l.forLoop();
		
	}
	void forLoop() {
		int row=5;
		for (int i = 0; i <row; i++) {
			
			for (int j = 0; j <(row-i); j++) {
				System.out.print(" ");
			}
			
			for (int K = 0; K <=i; K++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
