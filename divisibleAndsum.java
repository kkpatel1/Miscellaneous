// Let N be the smallest positive integer that is divisible by 128 and has digit sum equal to 128. 
// In decimal notation, N consists of  a 8's,  b 9's and possibly some other digits. What is a*b?

import java.math.BigInteger;
public class divisibleAndsum {
    public static int sumOfDigits(BigInteger i) {
        int sum=0;
        while(i!=BigInteger.valueOf(0)) {
            sum+=i.mod(BigInteger.valueOf(10)).intValue();
            i=i.divide(BigInteger.valueOf(10));
        }
        return sum;
    }
    public static void function(BigInteger i) {
        int a=0;
        int b=0;
        while(i!=BigInteger.valueOf(0)) {
            if(i.mod(BigInteger.valueOf(10))==BigInteger.valueOf(8)) a++;;
            if(i.mod(BigInteger.valueOf(10))==BigInteger.valueOf(9)) b++;;
            i=i.divide(BigInteger.valueOf(10));
        }
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        for(BigInteger i=new BigInteger("299999999999999"); ;i=i.add(BigInteger.valueOf(1))) {
            if(i.mod(BigInteger.valueOf(128))==BigInteger.valueOf(0)) {
                System.out.println(i);
                if(sumOfDigits(i)==128) {
                    function(i);
                    return;
                }
            }
        }
    }
}