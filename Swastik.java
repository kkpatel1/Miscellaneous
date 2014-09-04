/**
 * @(#)Swastik.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/18
 * 
 * Point quota remains
 */
import java.util.*;

class Swastik {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the Size of Swastik");
    	int n = in.nextInt();
    	for(int i=1; i<=n; i++) {
    		for(int j=0; j<17-n; j++){
    			System.out.print(" ");
    		}
    		if(i==n){
    			for(int j=1; j<=(n/2)+1; j++) {
    				System.out.print("*");
    			}
    			for(int j=1; j<=(n/2)-1; j++) {
    				System.out.print(" ");
    			}
    			System.out.println("*");
    		}
    		if(i>(n/2)+1 && i!=n) {
    			for(int j=1; j<=(n/2); j++) {
    				System.out.print(" ");
    			}
    			System.out.print("*");
    			for(int j=1; j<=(n/2)-1; j++) {
    				System.out.print(" ");
    			}
    			System.out.println("*");
    			
    		}
    		if(i == ((n/2)+1)) {
    			for(int j=1; j<=n; j++) {
    				System.out.print("*");
    			}
    			System.out.println();
    		}
    		if(i<=(n/2) && i!=1) {
    			System.out.print("*");
    			for(int j=1; j<(n/2); j++) {
    				System.out.print(" ");
    			}
    			System.out.println("*");    			
    		}
    		if(i==1) {
    			System.out.print("*");
    			for(int j=1; j<n/2; j++) {
    				System.out.print(" ");
    			}
    			System.out.print("*");
    			for(int j=1; j<(n/2)+1; j++) {
    				System.out.print("*");
    			}
    			System.out.println();
    		}
	    }
	    System.out.println("__________________________________");
	    n = in.nextInt();
    }
}