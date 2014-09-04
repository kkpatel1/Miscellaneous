// Conway's Game of Life is a simple algorithm that produces complex and often beautiful results. It is played on a grid and follows the rules below.

// Any live cell with fewer than two live neighbors dies, simulating under-population.
// Any live cell with two or three live neighbors lives on to the next generation.
// Any live cell with more than three live neighbors dies, simulating overcrowding.
// Any dead cell with exactly three live neighbors becomes a live cell, simulating reproduction.
//IMage RulesofLiving.png: Initial value.
//What will be next?

public class RulesOfLiving {
    static int[][] board = new int[6][6];
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                if (i == j)
                    board[i][j] = 1;
            board[i][5 - i] = 1;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] temp = new int[6][6];
        for(int i =0; i<6; i++)
            for(int j=0; j<6; j++)
                temp[i][j]=board[i][j];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
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
        for(int i =0; i<6; i++)
            for(int j=0; j<6; j++)
                board[i][j]=temp[i][j];
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int numOfLiveNeighbours(int i, int j) {
        int count = 0;
        if (i > 0 && board[i - 1][j] == 1)
            count++;
        if (i < 5 && board[i + 1][j] == 1)
            count++;
        if (j > 0 && board[i][j - 1] == 1)
            count++;
        if (j < 5 && board[i][j + 1] == 1)
            count++;
        if (i > 0 && j > 0 && board[i-1][j-1] == 1)
            count++;
        if (i < 5 && j > 0 && board[i+1][j-1] == 1)
            count++;
        if (i > 0 && j < 5 && board[i-1][j+1] == 1)
            count++;
        if (i < 5 && j < 5 && board[i+1][j+1] == 1)
            count++;
        return count;
    }
}