// I have an integer (in decimal representation) such that if I reverse its
// digits and add them up, I will get a new integer. I repeat this process until
// the resulting integer is a palindrome. We will denote an integer as a near-
// symmetric number if after twenty-five iterations, the resulting integer is
// still not a palindrome. What is the smallest positive near-symmetric number?

// Details and assumptions

// A palindrome is a number that remains the same when its digits are reversed.

// As an explicit example, consider the integer to be 49. The resulting number will
// be 49+94=143. Repeat:143+341=484, which is a palindrome (after 2<25 iterations). Thus  is not a near-
// symmetric number.

public class nearSymmetricNo {
    boolean isNearSymmetric(long n) {
        long k=n;
        for(int i=0; i<25; i++) {
            if(k==reverseNo(k)) return false;
            k = k+reverseNo(k);
        }
        return true;
    }
    long reverseNo(long n) {
        long sum=0;
        int noOfDigits=0;
        long l = n;
        while (l!=0) {
            l=l/10;
            noOfDigits++;
        }
        for(int i=1;i<=noOfDigits;i++) {
            long m=n%10;
            sum=sum*10+m;
            n=n/10;       
        }
        return sum; 
    }
    public static void main(String[] args) {
        for(int i=1; ; i++) {
            nearSymmetricNo obj = new nearSymmetricNo();
            if(obj.isNearSymmetric(i)) {
                System.out.println(i);
                return;
            }
        }
    }
}