package testPkg;

public class RevTrangle {
	public static void main(String args[]) {
		
		int row=5;
		for (int r = 1; r <= row; r++) {
			for (int s = 1; s <=r-1; s++) {
				System.out.print(" ");
			}
			for (int st = 1; st <=(row-r)*2+1; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
     
	}
}
