public class NoOfRectangle {
    static int area=1470;
    static int noOfpossibleRectangle() {
        int count=0;
        for(int i=1; i<Math.sqrt(1470); i++) {
            if(area%i == 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(noOfpossibleRectangle());
    }
}