/*
In a sports contest there were m medals awarded on n successive days (n >
1).
1. On the first day 1 medal and 1/7 of the remaining m - 1 medals were
awarded.
2. On the second day 2 medals and 1/7 of the now remaining medals was
awarded; and so on.
3. On the nth and last day, the remaining n medals were awarded.
How many days did the contest last, and how many medals were awarded
altogether?
*/
public class Puzzle {
    public static void main(String[] args) {
        int m;
        int s;
        boolean k=true;
        int i=1;
        int count=0;
        while(k==true) {
            m = 7*i +1;
            s=m;
            for(int j=1;;) {
                s=s-j;
                if((s/7)*7 != s) break;
                s=6*s/7;
                j++;
                count=j;
                if(s==j) {
                    System.out.println("Got");
                    k = false;
                    System.out.println(m);
                    System.out.println(count);
                    break;
                }               
            }
            i++;
            
            
            
        }
    }
}