public class PerfectSquareProblem {
    public static void main(String[] args) {
        long count=0;
        for(long i=1; i<1000000; i++) {
            long temp = (i+1)*(i+2)*2;
            long sqrt = (long)Math.sqrt(temp);
            if(sqrt*sqrt==temp) {
                count++;
                System.out.println(temp);
            }
        }
    }
}