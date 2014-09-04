/**
 * @(#)Distance.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/14
 *
 *	Enter 10 points and get the total distance.
 */
import java.util.*;

class Distance {

	public static void main(String[] args) {
		float x[] = new float[10];
		float y[] = new float[10];
		double distance = 0;
		Scanner in = new Scanner(System.in);
		for(int i=0; i<x.length; i++) {
			x[i]=in.nextInt();
			y[i]=in.nextInt();
		}
		for(int i=1; i<x.length;i++) {
			distance = distance + dis(x[i],y[i],x[i-1],y[i-1]);
		}
		System.out.println("Distance is "+distance+"\n");
		System.out.println("______________________");
		int i = in.nextInt();
	}    
    static double dis(float a,float b,float c,float d) {
    	double distancesq = (a-c)*(a-c)+(b-d)*(b-d);
    	return Math.sqrt(distancesq);
    }
}