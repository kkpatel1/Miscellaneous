/**
 * @(#)LCM.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/17
 *	Enter 2 No to get LCM
 */

import java.util.*;

class LCM {
	public static void main(String[] args) {
		int n1, n2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Add two numbers: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		int k=n2, l=1, m=1, n=n1;
		boolean x=false;
		for (int i=1; ; i++) {
			m = k*i;
			for (int j=1; (n1*j)<=m ; j++) {
				l=n*j;
				if (l==m) {
					System.out.println("LCM is "+l);
					x=true;
				}
				l=1;
			}
			if (x) break;
			m=1;
		}
		System.out.println("______________________________");
		n1=in.nextInt();
	}
}