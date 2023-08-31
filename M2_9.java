package activitiesModule2;
import java.util.Scanner;
public class M2_9 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    printDiamond(n);
	}
	public static void printDiamond(int n) {
        int nst=1;
	    int nsp=n-1;
	    int row=1;
	    while(row<=2*n){
	      for(int csp=1;csp<=nsp;csp++) {
	        System.out.print(" ");
	      }
	      for(int cst=1;cst<=nst;cst++){
	        System.out.print("*");
	      }
	      if(row<n){
	      nst=nst+2;
	      nsp=nsp-1;
	      }
	      else if(row==n){}
	      else{
	          nst=nst-2;
	          nsp=nsp+1;
	      }
	      System.out.println();
	      row=row+1;
	    }
    }
}
