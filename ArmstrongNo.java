/**
 * @(#)ArmstrongNoModified.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/8/12
 */
import java.util.*;
class ArmstrongNo {
    public static void main(String[] args){    
   		int n,m,i;
    	int l;
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter the Upper Limit");
    	int x=in.nextInt();
    	for (n=1;n<=x;n++) {
    		int sum=0;
    		int noOfDigits=0;
    		for (l=n;l!=0;l=l/10) {
    			noOfDigits++;
    		}
    		l=n;
    		for(i=1;i<=noOfDigits;i++) {
				m=l%10;
				sum=sum+(m*m*m);
				l=l/10;    		  	  
    		}
    		if(sum==n) {
    			System.out.println(sum);
    		}
    	}
   	System.out.println("_________________________");
   	x = in.nextInt();
   	}
}