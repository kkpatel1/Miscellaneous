// Surely you've heard of the perfect numbers, numbers that have the property
// that the sum of the proper factors of the number are equal to the number. The
// first few examples of perfect numbers are 6.28.496 Because the sum of the
// proper factors of perfect numbers is equal to the number, the sum of all of
// the factors of the number is equal to twice the number. Because of this,
// perfect numbers are called 2-perfect No.

// A number is k-perfect if the sum of the factors of the number is equal to k
// times the number. Let {a1, a2, ..., an} be the set of numbers that are the
// smallest k-perfect number for increasing values of k starting at 1. an is the
// smallest n-perfect number. What is the sum of the digits of this sum?
// a1+a2+a3+a4+a5

import java.math.*;
public class kPerfect {
    static BigInteger sumOfFactors(BigInteger n) {
        BigInteger sum=new BigInteger("0");
        for(int i=1; i<=Math.sqrt(n.longValue()); i++) {
            if(n.mod(BigInteger.valueOf(i)).longValue()==0) sum=sum.add(BigInteger.valueOf(i+(Math.sqrt(n.longValue())==i ? 0:((n.divide(BigInteger.valueOf(i)).longValue())))));
        }
        return sum;
    }
    static boolean iskPerfect(BigInteger n, int k) {
        if(n.multiply(BigInteger.valueOf(k)).longValue() == sumOfFactors(n).longValue()) return true;
        return false;
    }
    static BigInteger minkPerfect(int k) {
        BigInteger one = new BigInteger("1");
        BigInteger start=new BigInteger("1");
        if(k==5) start=new BigInteger("2000000");
        if(k==4) start=new BigInteger("30000");
        for(BigInteger i=start; ;i=i.add(one)) {
            System.out.println("Checking for "+k+"th perfect: No is "+i.toString());
            if(iskPerfect(i,k)) return i;
        }
    }
    public static void main(String[] args) {
        BigInteger a1=minkPerfect(1);
        System.out.println("1");
        BigInteger a2=minkPerfect(2);
        System.out.println("2");
        BigInteger a3=minkPerfect(3);
        System.out.println("3");
        BigInteger a4=minkPerfect(4);
        System.out.println("4");
        BigInteger a5=minkPerfect(5);
        System.out.println("5");
        BigInteger sum=a1.add(a2.add(a3.add(a4.add(a5))));
        System.out.printf("\n\na1=%s\n\na2=%s\n\na3=%s\n\na4=%s\n\na5=%s\n\nsum=%s\n\nSum of Digits of sum: %d\n",a1.toString(),a2.toString(),a3.toString(),a4.toString(),a5.toString(),sum.toString(),sum.toString().length());
    }
}