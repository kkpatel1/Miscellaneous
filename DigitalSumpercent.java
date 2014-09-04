public class DigitalSumpercent {
    static int countmain=0;
    static int digitalRoot2 = 0;
    static boolean isPrime(int n) {
        if(n==1) return false;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        countmain++;
        if(n%9 == 2) digitalRoot2++;
        return true;
    }
    public static void main(String[] args) {
        for(int i=1; i<=2000000; i++) {
            isPrime(i);
        }
        double percent;
        percent = ((double)digitalRoot2)*100000/((double)countmain);
        System.out.println(percent);
    }
}