package activitiesModule2;
import java.util.Scanner;
//similar to M2_2
public class M2_11 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    printTriangle(n);
	}
	public static void printTriangle(int n) {
	       int nst=1;
	        int row=1;
	        while(row<=n){
	            if(row%2==0){
	                for(int cst=1;cst<=nst;cst++){
	                        if(cst%2!=0)
	                            System.out.print("0"+" ");
	                        else
	                            System.out.print("1"+" ");
	                }
	                
	            }
	            else{
	                    for(int cst=1;cst<=nst;cst++){
	                        if(cst%2!=0)
	                            System.out.print("1"+" ");
	                        else
	                            System.out.print("0"+" ");
	                    }
	                            
	                 }
	            row++;
	            nst++;
	            System.out.println();
	        }
	    }
}
