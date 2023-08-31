package activitiesModule2;
import java.util.Scanner;
public class M2_12 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    printTriangle(n);
	}
	public static void printTriangle(int n) {
        int nst=1;;
	    int nsp=2*n-2;
	    int row=1;
	    while(row<=n)
	    {
	            int val=1;
	    		for(int cst=1;cst<=nst;cst++){
	    			System.out.print(val+" ");
	    			val++;
	    		}
	    
	    		for(int csp=1;csp<=nsp;csp++){
	    			System.out.print("  ");
	    		}
	    		for(int cst=nst;cst>=1;cst--){
	    			System.out.print(val-1+" ");
	    			val--;
	    		}
	    	System.out.println();
	    	row=row+1;
	    	nst++;
	    	nsp=nsp-2;
	    }
    }
	
}
