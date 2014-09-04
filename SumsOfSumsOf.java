
public class SumsOfSumsOf {
    public static void main(String[] args) {
        try {
            System.out.println(sum(2014, 1));
        }
        catch(Error e) {
            System.out.println(e);
        }
    }
    static long sum(int end, int term) {
        if(term == 2015) return 1;
        long sumVal = 0;
        System.out.println(term);
        for(int i=1; i<end+1; i++) {
            sumVal += sum(i, term+1);
        }
        return sumVal;
    }   
// def sum(end, term):
//     if term == 2015:
//         return 1
//     sumVal = 0
//     for i in range(1, end+1):
//         sumVal += sum(i, term+1)
//     return sumVal

// print sum(2014, 1)
}