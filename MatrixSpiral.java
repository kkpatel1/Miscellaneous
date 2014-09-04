/**
 * @(#)MatrixSpiral.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/17
 *	Enter order of the matrix and get the spiral of no of that order
 */

import java.util.*;
class MatrixSpiral {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Order of the Matrix");
		int n = in.nextInt();
		int matrix[][] = new int[n][n];
		int c=1;
		for(int k = 0; k<n; k++){
			for(int j=k; j<n-k; j++) {
				matrix[k][j]=c;
				c++;
			}
			for(int j=1+k; j<n-k; j++) {
				matrix[j][n-(1+k)]=c;
				c++;
			}
			for(int j=2+k; j<n-k; j++) {
				matrix[n-(1+k)][n-j] = c;
				c++;
			}
			for(int j=1+k; j<n-k; j++) {
				matrix[n-j][k]=c;
				c++;
			}
		}		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(matrix[i][j]+"	");
			}
			System.out.println("\n");
		}
		System.out.println("________________________");
		c = in.nextInt();
	}
}