//Find n such that
//  7/(n+9), 8/(n+10), 9/(n+11)....2014/(2016+n) are in their smallest form

//Not Required Nos.
//0, 2, 4, 6, 8, 10, .... 2k-2
//1, 4, 7, 10, 13, 16,... 3k-2
//3, 8, 13, 18, 23, 28,.. 5k-2
//............................
//Most Probably upto 2016;

public class SmallestForms {
    static int primeArr[];
    boolean numberStream[];
    public SmallestForms() {
        primeArr = new int[3000];
        generatePrimes();
        numberStream = new boolean[2500];
        for(int i=0; i<numberStream.length; i++) {
            numberStream[i] = false;
        }
    }
    public void generatePrimes() {
        int count=0;
        for(int i=2; count<primeArr.length && i<2014; i++) {
            if(isPrime(i)) primeArr[count++]=i;
        }
    }
    public boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i ==0) return false;
        }
        return true;
    }
    public void settingNumberStream() {
        for(int i=0; i<numberStream.length; i++) {
            for(int j=0; j<primeArr.length && !numberStream[i] && primeArr[j]!=0; j++) {
                if((i+2)%primeArr[j]==0) numberStream[i]=true;
            }
        }
    }
    public static void main(String[] args) {
        SmallestForms obj = new SmallestForms();
//        for(int i=0; i<primeArr.length && primeArr[i]!=0; i++) System.out.println(primeArr[i]);
        obj.settingNumberStream();
        for(int i=0; i<obj.numberStream.length; i++) {
            if(!obj.numberStream[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}