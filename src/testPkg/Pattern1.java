package testPkg;

public class Pattern1 {
	public static void main(String arges[]) {
		int row=6;
		for (int i = 1; i <=row ; i++) {
			for (int s = 1; s <=row-i ; s++) {
				System.out.print(" ");	
			}
			for (int j = 1; j <=(i*2-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
