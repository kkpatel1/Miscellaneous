/**
 * @(#)Ramanujam_No.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/17
 *	Enter the upper limit and get the Ramanujam No. up to that limit
 */


import java.util.*;

class Ramanujam_No {
	private static long[][] countArray = new long[2][2];
	public static boolean check (long n) {
		int count=-1;
		for (long i=1; i<=Math.cbrt(n); i++){
			for(long j=1; j<=i; j++) {
				if((i*i*i+j*j*j) == n) {
					count++;
					countArray[count][0]=i;
					countArray[count][1]=j;
				}
			}
		}
		if (count >=1) return true;
		else return false;
	}
	public static void main(String[] args) {
		long range;
		System.out.println("Upper limit = ");
		Scanner in = new Scanner(System.in);
		range = in.nextLong();
		for (long i=1; i<=range; i++){
			if(check(i)){
				System.out.println(i+" = ("+countArray[0][0]+","+countArray[0][1]+") & ("+countArray[1][0]+","+countArray[1][1]+")");
			}
		}
	System.out.println("_________________________________");
	range = in.nextLong();
	}
}