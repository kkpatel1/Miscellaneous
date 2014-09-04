public class ImportantNo {
    static int[] noArr;
    static int[] origArr;
    public static void main(String[] args) {
        noArr = new int[9];
        origArr = new int[9];
        placeNo(0,1);
        display();
    }
    static boolean placeNo(int i, int no) {
        no = no%10;
        if(no==0) no++;
        origArr[i] = no;
        if(place(i,no)) return true;
        return false;
    }
    static boolean place(int i, int no) {
        no = no%10;
        if(no==0) no++;
        if(check(i,no)) {
            if(i+1!=9)
                return placeNo(i+1 , no+1);
            return false;
        }
        int num=(noArr[i]+1)%10;
        if(num==0) num++;
        if(num!=origArr[i]) {
            return place(i,noArr[i]+1);
        }
        noArr[i]=0;
        return place(i-1, noArr[i-1]+1);
    }
    static boolean check(int i, int no) {
        noArr[i] = no;
        if(i%2 == no%2) return false;
        if((i==4 && no!=5) || (i!=4 && no==5)) return false;
        for(int j=0; j<i; j++) {
            if(noArr[j]==no) return false;
        }
        int num=0;
        for(int j=0; j<i+1; j++) {
            num = (num*10)+noArr[j];
        }
        if(num%(i+1)!=0) return false;
        return true;
    }
    static void display() {
        System.out.print("\nA number of 9 digits has the following properties: \n The number formed from the first n digits is divisible by n, 2<=n<=9. \n Each digit in the number is different i.e. no digits are repeated. \n The digit 0 does not occur in the number i.e. it is comprised only of the digits 1-9 in some order. \n Find the number.");
        System.out.print("\n\nThe asked No is: ");
        for(int i=0; i<9; i++) {
            System.out.print(noArr[i]);
        }
        System.out.println();
    }
}