/**
 * @(#)sine.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/8/19
 *	Enter the Angle in radians and no of terms upto which accuracy is needed
 */

import java.util.*;
import java.lang.Math;

class sine {
	public static int factorial(int n) {
		int fact=1,i;
		for (i=1;i<=n;i++) {
			fact=fact*i;
		}
			return fact;
	}
    public static double sine(double ang, int acc) {
    	int i,l,j;
    	double mul,term,sum=0;
    	for(i=1; i<=acc; i++) {
    		l=2*i-1;
    		mul=1;
    		for(j=1;j<=l;j++) {
				mul=mul*ang;
    		}
    		if(i%2==0) mul=-1*mul;
    		term=mul/factorial(l);
    		sum=sum+term;
    	}
    	return sum;
    }
    public static void main(String[] args) {
    	double sine,error,sinOriginal;
    	Scanner ang = new Scanner(System.in);
    	double angleDeg = ang.nextDouble();
    	double angle=angleDeg*3.14/180;
    	Scanner acc = new Scanner(System.in);
    	int accuracy = acc.nextInt();
		sine=sine(angle,accuracy);
		sinOriginal= Math.sin(angle);
		error=(sine-sinOriginal)/sinOriginal*100;
		System.out.println("Value "+sine);
		System.out.println("Error "+error);
    	System.out.println("___________________________________");
    	accuracy = acc.nextInt();
    }
}