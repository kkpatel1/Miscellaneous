//For which n, 1000-n C n is maximized
import java.math.*;
public class maximisenCr {
    public static void main(String[] args) {
        BigInteger max = new BigInteger("0");
        int maxAt = 0;
        for(int i = 0; i<500; i++) {
            BigInteger nCr = nCr(i);
            System.out.println("For i= "+i);
            if(max.max(nCr) != max) {
                max = nCr;
                maxAt = i;
                System.out.println("Max at "+i);
            }
        }
        System.out.println(maxAt);
    }
    public static BigInteger nCr(int n) {
        BigInteger value = factorial(1000-n).divide(factorial(n).multiply(factorial(1000-2*n)));
        return value;
    } 
    static BigInteger factorial(long n) {
        BigInteger p = new BigInteger("1");
        for(long i=1; i<=n; i++) {
            p=p.multiply(BigInteger.valueOf(i));
        }
        return p;
    }
}