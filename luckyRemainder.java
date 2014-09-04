//How many positive integers, a, are there such that 2027 divided by a leaves a remainder of 7?
public class luckyRemainder {
    static int noOfFactors(int k) {
        int count=0;
        for(int i=1; i<=k; i++) {
            if(k%i == 0) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(noOfFactors(2020));
    }
}