//what are the last three digits of the smallest prime factor of
//340282366920938463463374607431768211457

import java.math.*;
public class BigPrimeFactor {
    BigInteger n;
    public BigPrimeFactor() {
        n = new BigInteger("340282366920938463463374607431768211457");
        BigInteger a = smallestPrimeFactor(n);
        System.out.println(a.mod(BigInteger.valueOf(1000)).toString());
    }
    BigInteger smallestPrimeFactor(BigInteger n) {
        for(BigInteger i=BigInteger.valueOf(2); i.max(n)==n ;i=i.add(BigInteger.valueOf(1))) {
            if(n.mod(i)==BigInteger.valueOf(0)) 
                if(isPrime(i))
                    return i;
        }
        return BigInteger.valueOf(-1);
    }
    boolean isPrime(BigInteger n) {
        for(BigInteger i=BigInteger.valueOf(2); i.longValue()<=Math.sqrt(n.longValue()); i=i.add(BigInteger.valueOf(1))) {
            if(n.mod(i)==BigInteger.valueOf(0)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        BigPrimeFactor obj = new BigPrimeFactor();
    }
}