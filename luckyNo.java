// Let's say that a number k is "lucky" if it has the following characteristics:

// It has 6 digits

// The sum of its first three digits is equal to the sum of its last three digits

// Let N be the total number of positive 6-digit "lucky" numbers. What are the last three digits of N?

public class luckyNo {
    public static int sumOfDigits(int i) {
        int sum=0;
        while(i!=0) {
            sum+=i%10;
            i=i/10;
        }
        return sum;
    }
    public static boolean check(int i) {
        return sumOfDigits(i/1000)==sumOfDigits(i%1000);
    }
    public static int function() {
        int count=0;
        for(int i=100001; i<=999999; i++) {
            if(check(i)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(function());
    }
}