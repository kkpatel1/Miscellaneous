// Let f(n) be a function that finds the sum of the digits of n. What are the last 3 digits of this expression?

// for i=1to17 and for j=1 to 29 Sigma of f(i^3+j^3)

public class Summation {
    static int sum() {
        int sum=0;
        for(int i=1; i<=17; i++) {
            for(int j=1; j<=29; j++) {
                sum+=f(i*i*i + j*j*j);
            }
        }
        return sum;
    }
    static int f(int n) {
        int sum=0;
        for(; n!=0; n=n/10) {
            sum=sum+n%10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum()%1000);
    }
}