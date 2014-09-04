// Jenny is the operator of a large garbage disposal machine.
// It is a fairly simple machine and constitutes of only three buttons:
// One red button,one blue button and one green button.

// Given that initially n items are put in the machine. It will only destroy garbage in the three following ways:

// The green button, if pressed destroys 1/2 of the items,leaving 1/2 of the items, but it only works if the number of items n is divisible by 2.
// The blue button,if pressed destroys 2/3 of the items,leaving 1/3 items, but it only works if the number of items n is divisible by 3.
// The red button always works and destroys only 1 item leaving n-1 if pressed.
// Since Jenny is a lazy operator she wants to minimize the number of times she presses the buttons? What is the minimum number of times Jenny has to press the buttons in order to completely destroy 466559 items?

// for n=10 ; red, blue, blue, red

import java.util.*;
public class DontPushMyButton {
    int n;
    int count;
    static int array[];
    static int o;
    public DontPushMyButton(int n) {
        this.n = n;
        array = new int[n];
        count=countf0(n);
    }
    static int countf0(int i) {
        if(i==0) return 0;
        if(array[i-1]!=0) {
            return array[i-1];
        }
        int a = countf1(i);
        int b = countf2(i);
        int d = countf4(i);
        int min = (a>b?b:a)>d?d:(a>b?b:a);
        array[i-1]=min;
        return min;
    }
    static int countf1(int i) {
        if((i-1)%3==0 && i!=1) return countf0(i-1)+1;
        if(i%3 == 0) return countf0(i/3)+1;
        if(i%2 == 0) return countf0(i/2)+1;
        return countf0(i-1)+1;
    }
    static int countf2(int i) {
        if(i%3 == 0) return countf0(i/3)+1;
        if(i%2 == 0) return countf0(i/2)+1;
        return countf0(i-1)+1;
    }
    static int countf3(int i) {
        if((i-2)%3==0 && i!=1) return countf0(i-1)+1;
        if(i%3 == 0) return countf0(i/3)+1;
        if(i%2 == 0) return countf0(i/2)+1;
        return countf0(i-1)+1;
    }
    static int countf4(int i) {
        if((i-1)%2==0 && i!=1) return countf0(i-1)+1;
        if(i%3 == 0) return countf0(i/3)+1;
        if(i%2 == 0) return countf0(i/2)+1;
        return countf0(i-1)+1;
    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        DontPushMyButton obj = new DontPushMyButton(in.nextInt());
        System.out.println(obj.count);
    }
}