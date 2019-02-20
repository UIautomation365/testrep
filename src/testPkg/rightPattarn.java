package testPkg;

public class rightPattarn {
	public static void mian(String[] str) {
		int row=5;
		for (int i = 1; i <=row ; i++) {
			for (int j = 1; j <=(row-i); j++) {
				System.out.print(" ");
			}
			for (int s = 1; s <=i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
