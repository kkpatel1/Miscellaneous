//Find the largest integer n<=200 such that for some positive integer k<n the product n!k! is a perfect square.

import java.math.*;
public class FactorialProductSquare {
    public static void main(String[] args) {
        try{
        int count=0;
        boolean flag=false;
        for(int i=1; i<200; i++) {
            for(int k=i-1; k>=1 && !flag; k--) {
                BigInteger fact=factorial(BigInteger.valueOf(i),BigInteger.valueOf(k));
        //        long fact=factorial(i,k);
            //    long sqrt=(long)Math.sqrt(fact);
                BigInteger sqrt = BigInteger.valueOf((long)Math.sqrt(fact.longValue()));
                if(fact==sqrt.multiply(sqrt)) {
                    flag=true;
                    System.out.println(i+", "+k);
                }
            }
            if(flag) {
                flag=false;
                System.out.println(i);
                //count=i;
            }
        }
    //    System.out.println(count);
        }
        catch(Error e) {
            System.out.println(e);
        }
    }
    static BigInteger factorial(BigInteger n, BigInteger k) {
        BigInteger product=new BigInteger("1");
 //       System.out.println("Inside Factorial("+n+", "+k+")");
        for(BigInteger i=n; i.max(k)==i; i=i.subtract(BigInteger.valueOf(1))) {
            product = product.multiply(i);
        }
        return product;
    }
    // static long factorial(int n, int k) {
    //     long product=1;
    //     for(int i=n; i>k; i--) {
    //         product*=i;
    //     }
    //     return product;
    // }
}