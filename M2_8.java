package activitiesModule2;
import java.util.Scanner;
public class M2_8 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    printTriangle(n);
	}
	public static 
	void printTriangle(int n) {
	       int nst=2*n-1;
		    int nsp=0;
		    int row=1;
		    while(row<=n){
		      for(int csp=1;csp<=nsp;csp++) {
		        System.out.print(" ");
		      }
		      for(int cst=1;cst<=nst;cst++){
		        System.out.print("*");
		      }
		      System.out.println();
		      nst=nst-2;
		      nsp=nsp+1;
		      row=row+1;
		    }
	    }

}
