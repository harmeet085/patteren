package activitiesModule2;
import java.util.Scanner;
public class M2_13 {
	public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter no of rows");
	    int n=sc.nextInt();
	    printTriangle(n);
	}
	public static  void printTriangle(int n) {
        int nst=1;
       int row=1;
        int val=1;
       while(row<=n){
           for(int cst=1;cst<=nst;cst++){
               System.out.print(val+" ");
               val++;
           }
           row++;
           nst++;
           System.out.println();
       }
   }
}
