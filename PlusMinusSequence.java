// Begin with 0
// When you see a + sign, add 1 to get the next term
// When you see a - sign, subtract 1 to get the next term
// For example, the sequence +-++-+-++--- gives rise to the following sequence of integers: 0, 1, 0, 1, 2, 1, 2, 1, 2, 3, 2, 1, 0.

// Call a sequence of + and - signs good if the resulting sequence of integers contains no negative numbers and ends with 0.
// Our sequence +-++-+-++--- is a good sequence of length 12. The sequences +++-- and +--+ are not good.

// Let N be the number of all good sequences of + and - signs of length 40. Find the first three digits of N.

public class PlusMinusSequence {
    static boolean array[] = new boolean[40];
    public static boolean check(int n) {
        int plus=0;
        int minus=0;
        for(int i=0; i<n; i++) {
            if(array[i]) {
                plus++;
            }
            if(!array[i]) {
                minus++;
            }
        }
        return plus>minus;
    }
    public static int function(int i) {
        if(i>39) {
            display();
            return (check(40) ? 0:1);
        }
        int a=0;
        if(!check(i)) {
            array[i]=true;
            a=function(i+1);
        }
        else {
            array[i]=false;
            int b=function(i+1);
            array[i]=true;
            int c=function(i+1);
            a=b+c;
        }
        return a;
    }
    public static void display() {
        int element=0;
        System.out.print(0+" ");
        for(int i=0; i<array.length; i++) {
            if(array[i])
                System.out.print(++element+" ");
            else
                System.out.println(--element+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println(function(0));
    }
}