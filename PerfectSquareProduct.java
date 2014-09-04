public class PerfectSquareProduct {
    public static void main(String[] args) {
        long count=0;
        for(int i=1; i<1000; i++) {
            long temp=792*i;
            long sqrt=(long)Math.sqrt(temp);
            if(sqrt*sqrt == temp) {
                count++;
                System.out.println(temp);
            }
        }
        System.out.println(count);
    }
}