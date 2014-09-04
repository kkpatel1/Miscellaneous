import java.math.*;
public class bigFactorial {
    static BigInteger factorial(long n) {
        BigInteger p = new BigInteger("1");
        for(long i=1; i<=n; i++) {
            p=p.multiply(BigInteger.valueOf(i));
        }
        return p;
    }
    public static void main(String[] args) {
        System.out.println(factorial(10000).toString().length());
    }
}