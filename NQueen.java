import java.util.*;
public class NQueen {
    static int n;
    static int result[][];
    static int[] cols;
    public NQueen() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        n = in.nextInt();
        result = new int[n][n];
        cols = new int[n];
    }
    public boolean placeQueen(int row, int col) {
        if(row==n) return true;
        if(placeRow(row,col)) return placeQueen(row+1,0);
        if(row==0) {
            for(int i=0; i<n; i++)
                result[i][cols[i]]=0;
            return false;
        }
        else return placeQueen(row-1,cols[row-1]+1);
    }
    public boolean placeRow(int row, int col) {
        if(col==n) return false;
        for(int i=row; i<n; i++) {
            result[i][cols[i]]=0;
            cols[i]=0;
        }
        for(int i=col; i<n; i++) {
            if(check(row,i)) {
                result[row][i] = 1;
                cols[row] = i;
                return true;
            }
        }
        return false;
    }
    boolean check(int row, int col) {
        for(int i=0; i<row; i++) {
            if(result[i][col]==1) return false;
        }
        for(int i=0; i<col; i++) {
            if(result[row][i]==1) return false;
        }
        int tempRow=row-1;
        int tempCol=col-1;
        while(tempCol!=-1 && tempRow!=-1) {
            if(result[tempRow--][tempCol--]==1) return false;
        }
        tempRow=row-1;
        tempCol=col+1;
        while(tempCol!=n && tempRow!=-1) {
            if(result[tempRow--][tempCol++]==1) return false;
        }
        return true;
    }
    void display() {
            for(int j=0; j<n; j++) {
                System.out.print(" ");
                System.out.print("_");
            }
        System.out.println();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(result[i][j]==1) System.out.print("|*");
                else System.out.print("| ");
            }
            System.out.println("|");
            for(int j=0; j<n; j++) {
                System.out.print(" ");
                System.out.print("_");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        NQueen NMat = new NQueen();
        try {
            NMat.placeQueen(0,0);
            NMat.display();
        }
        catch(Error e) { System.out.println(e); }
    }
 }