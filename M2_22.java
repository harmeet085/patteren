package activitiesModule2;

import java.util.Scanner;

public class M2_22 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    printSquare(n);
	}
	public static void printSquare(int n) {
        int nst=1;
        int nsp=2*n-3;
	    int row=1;
	    while(row<=2*n-1){
	        int val=n;
	    		for(int cst=1;cst<=nst;cst++){
	  	    		System.out.print(val+" ");
	  	    		val--;
	    		}
	  	    	for(int csp=1;csp<=nsp;csp++)
	  	    	    	System.out.print(val+1+" ");
	  	    	if(row==n){
	  	    	    for(int cst=1;cst<nst;cst++){
	  	    	        System.out.print((val+2)+" ");
	  	    		    val++;
	  	    	    }
	  	    	}
	  	    	else{
	  	    	for(int cst=1;cst<=nst;cst++){
	  	    		System.out.print((val+1)+" ");
	  	    		val++;
	  	    	}
	  	    	}
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
