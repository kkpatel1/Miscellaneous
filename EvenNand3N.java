//How many four-digit positive integers N are there such that both N and 3N only have even digits?

public class EvenNand3N {
    public static boolean checkEven(int i) {
        while(i!=0) {
            if(i%2==1) return false;
            i=i/10;
        }
        return true;
    }
    public static boolean function(int i) {
        return checkEven(i) && checkEven(3*i);
    }
    public static void main(String[] args) {
        int count=0;
        for(int i=1000; i<10000; i++) {
            if(function(i)) count++;
        }
        System.out.println(count);
    }
}