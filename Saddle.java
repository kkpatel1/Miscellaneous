/**
 * @(#)Saddle.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/16
 *	Class to find Saddle point
 */
import java.util.*;

class Saddle {
	private int n;
	private int matrix[][];
	private int row;
	private int coloumn;
	Scanner in = new Scanner(System.in);
	public Saddle(int n) {
		this.n=n;
		matrix = new int[n][n];

		for(int j=0; j<n; j++) {
			System.out.println("Enter Row "+(j+1));
			for(int i=0; i<n; i++) {
				matrix[i][j]=in.nextInt();
			}
		}
		row = -1;
		coloumn = -1;
	}
	boolean test(int i) {
		int b=-100000;
		int a=100000;
		boolean x=false;
		int k=-1,l,m=-1;

		for(int j=0; j<n; j++){
			if(b<matrix[i][j]){
				b=matrix[i][j];
				k=j;
			}
		}

		for(l=0; l<n; l++) {
			if(a>matrix[l][k]) {
				a=matrix[l][k];
				m=l;
			}
		}
		if(i==m) { x=true; coloumn=m+1; row=k+1; }
		else x=false;
		return x;
	}
	public void display() {
		int count = 0;
		for(int i=0; i<n; i++) {
			if(test(i)) {
				System.out.println("Saddle Point is availible at ("+row+","+coloumn+") "+matrix[coloumn-1][row-1]);
				count++;
			}
		}
		if(count==0) System.out.println("Saddle Point is not Availible");
	}
}
