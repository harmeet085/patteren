package activitiesModule2;

public class PATTTERN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nst = n;
		int row = 1;
		while (row <= n) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print("*");
			}
			System.out.println();
			row++;
		}
	}

}
