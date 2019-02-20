package testPkg;

public class pattern4 {
	public static void main(String args[]) {
		int row=5;
		for (int i = 1; i <=row ; i++) {
			for (int s = 1; s <=i; s++) {
				System.out.print(" ");
			}	
			for (int j = 1; j <=(row-i)*2+1 ; j++) {
				System.out.print("*");	
			}
			System.out.println();

		}

	}

}
