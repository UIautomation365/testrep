package testPkg;

public class Pattern3 {
	public static void main(String[] args ) {
		int row=5;
		for (int i = 0; i <row; i++) {
			for (int s = 0; s <i; s++) {
				System.out.print(" ");
			}
			for (int j = 0; j <(row-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
