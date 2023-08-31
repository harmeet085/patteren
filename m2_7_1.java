package activitiesModule2;

public class m2_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=4;
			int row=1;
			int nst =1;
			int nsp = n-1;
			while(row<=n) {
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			nsp--;
			nst++;row++;
			System.out.println();
			}
	}

}
