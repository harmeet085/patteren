package activitiesModule2;
import java.util.Scanner;
public class M2_20 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    printTriangle(n);
	}
	public static  void printTriangle(int n) {
        int nst=1;
	    int nsp=2*n-2;
	    int row=1;
	    while(row<=2*n-1){
	    		for(int cst=1;cst<=nst;cst++)
	  	    		System.out.print("*");
	    		for(int csp=1;csp<=nsp;csp++)
	    			System.out.print(" ");
	    		for(int cst=1;cst<=nst;cst++)
	    			System.out.print("*");
	    		System.out.println();
	    	    if(row<n){	    	
   			    nst=nst+1;
   				nsp=nsp-2;
   			}
	    	    else{
	    		    nst=nst-1;
	    		    nsp=nsp+2;
	    	    }
	    	    row=row+1;
	    }
   }
}
