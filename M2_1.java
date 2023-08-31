package activitiesModule2;
import java.util.Scanner;
public class M2_1 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    
	    printSquare(n);
	}
	public static void printSquare(int n) {
	        int nst=n;
	        int row=1;	       
	        while(row<=n){
	            for(int cst=1;cst<=nst;cst++){
	                System.out.print("*"+" ");
	            }
	            row++;
	            System.out.println();
	            }
	}

}
