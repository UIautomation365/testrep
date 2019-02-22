package testPkg;

public class trangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=row-i; j++) {
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <=(i*2-1); j2++) {
				System.out.print("*");

			}
			System.out.println();
		}

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
