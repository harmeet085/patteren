package activitiesModule2;

import java.util.Scanner;

public class M2_21 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    printSquare(n);
	}
	public static void printSquare(int n) {
	    int nsp=n-2;
	    int row=1;
	    while(row<=n){
	        if(row==1 || row==n){
	    		for(int cst=1;cst<=n;cst++)
	  	    		System.out.print("*");
	        }
	        else{
	    		System.out.print("*");
	    		for(int csp=1;csp<=nsp;csp++)
	    			System.out.print(" ");
	    			System.out.print("*");
	        }
	    		System.out.println();
	    	    row=row+1;
	    }
    }
}
