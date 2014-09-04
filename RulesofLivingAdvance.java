// Conway's Game of Life is a simple algorithm that produces complex and often beautiful results. It is played on a grid and follows the rules below.

// Any live cell with fewer than two live neighbors dies, simulating under-population.
// Any live cell with two or three live neighbors lives on to the next generation.
// Any live cell with more than three live neighbors dies, simulating overcrowding.
// Any dead cell with exactly three live neighbors becomes a live cell, simulating reproduction.
// If the grid in image RulesofLivingAdvance.png is generation 1, what is the number of the last generation with living cells?

// Details and assumptions
// Every cell not on the edges of the grid has  neighbors: namely, any cell that is horizontally, vertically, or diagonally adjacent.

// A generation constitutes one simultaneous application of the rules to every cell in the grid.
public class RulesofLivingAdvance {
    static int[][] board = new int[26][27];
    public static void main(String[] args) {
        int count=0;
        board[1][5]=1;
        board[1][12]=1;
        board[2][22]=1;
        board[2][24]=1;
        board[3][2]=1;
        board[3][8]=1;
        board[3][9]=1;
        board[3][17]=1;
        board[4][1]=1;
        board[4][17]=1;
        board[7][10]=1;
        board[7][11]=1;
        board[9][9]=1;
        board[9][11]=1;
        board[10][10]=1;
        board[11][17]=1;
        board[12][1]=1;
        board[12][22]=1;
        board[13][1]=1;
        board[13][7]=1;
        board[13][22]=1;
        board[15][23]=1;
        board[16][24]=1;
        board[17][16]=1;
        board[17][17]=1;
        board[17][23]=1;
        board[18][11]=1;
        board[19][2]=1;
        board[19][3]=1;
        board[19][11]=1;
        board[21][16]=1;
        board[21][23]=1;
        board[22][17]=1;
        board[22][22]=1;
        display();
        System.out.println();
        while(notEmpty()) {
            count++;
            int[][] temp = new int[26][27];
            for(int i =0; i<26; i++)
                for(int j=0; j<27; j++)
                    temp[i][j]=board[i][j];
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 27; j++) {
                    if (board[i][j] == 1) {
                        if (numOfLiveNeighbours(i, j) < 2 || numOfLiveNeighbours(i, j) >3)
                            temp[i][j] = 0;
                    }
                    else {
                        if (numOfLiveNeighbours(i, j) == 3)
                            temp[i][j] = 1;
                    }
                }
            }
            for(int i =0; i<26; i++)
                for(int j=0; j<27; j++)
                    board[i][j]=temp[i][j];
            System.out.println();
        }
        System.out.println(count);
    }
    static int numOfLiveNeighbours(int i, int j) {
        int count = 0;
        if (i > 0 && board[i - 1][j] == 1)
            count++;
        if (i < 25 && board[i + 1][j] == 1)
            count++;
        if (j > 0 && board[i][j - 1] == 1)
            count++;
        if (j < 26 && board[i][j + 1] == 1)
            count++;
        if (i > 0 && j > 0 && board[i-1][j-1] == 1)
            count++;
        if (i < 25 && j > 0 && board[i+1][j-1] == 1)
            count++;
        if (i > 0 && j < 26 && board[i-1][j+1] == 1)
            count++;
        if (i < 25 && j < 26 && board[i+1][j+1] == 1)
            count++;
        return count;
    }
    static void display() {
        for(int j=0; j<27; j++) {
            System.out.print(" ");
            System.out.print("_");
        }
        System.out.println();
        for(int i=0; i<26; i++) {
            for(int j=0; j<27; j++) {
                if(board[i][j]==1) System.out.print("|*");
                else System.out.print("| ");
            }
            System.out.println("|");
            for(int j=0; j<27; j++) {
                System.out.print(" ");
                System.out.print("_");
            }
            System.out.println();
        }
    }
    static boolean notEmpty() {
        for(int i=0; i<26; i++)
            for(int j=0; j<27; j++)
                if(board[i][j]==1) return true;
        return false;
    }
}