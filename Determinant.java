/**
 * @(#)Determinant.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/12
 *
 *	Enter the Matrix and get the value of Deteminant
 */

import java.util.*;

class Determinant {
	
    private static float[][] matrix;
    private static int n;
    
    public static float determinant() {												
    	int count=0;
    	float det=1;			
    	boolean x=true;															
    	for(int l=1; l<n; l++) {
    		if(matrix[l-1][l-1]==0) {
    			x=false;
    			for(int i=l; i<n; i++){
    				if(matrix[i][l-1]!=0) {
    					x=true;
    					float a[] = new float[n];
    					for(int j=0; j<n; j++) {
    						a[j]=matrix[i][j];
    						matrix[i][j] = matrix[l-1][j];
    						matrix[l-1][j] = a[j];
    					}
    					count++;
    					break;
    				}
    			}
    		}
    		for(int i=l; i<n; i++) {	
   				float k = matrix[i][l-1];
    			if(x){
    				for(int j=0; j<n; j++) {										
   	    				matrix[i][j]-=(k/matrix[l-1][l-1])*matrix[l-1][j];
    				}
    			}
    			else continue;
    		}
    	}
 		for(int i=0; i<n; i++) det = det*matrix[i][i];
 		if(count%2 !=0) det = -det;
    	return det;
    }
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the Order of the Determinant");
    	n = in.nextInt();
    	matrix = new float[n][n];
    	for(int i=0; i<n; i++) {
    		System.out.println("Enter Row "+(i+1));
    		for(int j=0; j<n; j++){
    			matrix[i][j]=in.nextFloat();
    		}    	
    	}
    	float det = determinant();
    	System.out.println();
    	for(int i=0; i<n; i++){
    		for(int j=0; j<n; j++) {
    			System.out.printf("%.2f	",matrix[i][j]);
    		}
    		System.out.println("\n");
    	}
    	System.out.printf("\n%.2f\n",det);
    	System.out.println("________________________");
    	n=in.nextInt();
    }    
}
