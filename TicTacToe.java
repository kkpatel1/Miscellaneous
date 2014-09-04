import java.util.*;

public class TicTacToe {
    static char square[] = {'0','1','2','3','4','5','6','7','8','9'};
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int player = 1;
            int i,choice;
            char mark;
            do {
                    board();
                    player= (player%2 != 0) ? 1:2;
                    System.out.println("Player " + player + ": Enter your choice");
                    choice = in.nextInt();
                    mark=(player == 1) ? 'X' : 'O';
                    if (choice == 1 && square[1] == '1')
                            square[1] = mark;
                    else if (choice == 2 && square[2] == '2')
                            square[2] = mark;
                    else if (choice == 3 && square[3] == '3')
                            square[3] = mark;
                    else if (choice == 4 && square[4] == '4')
                            square[4] = mark;
                    else if (choice == 5 && square[5] == '5')
                            square[5] = mark;
                    else if (choice == 6 && square[6] == '6')
                            square[6] = mark;
                    else if (choice == 7 && square[7] == '7')
                            square[7] = mark;
                    else if (choice == 8 && square[8] == '8')
                            square[8] = mark;
                    else if (choice == 9 && square[9] == '9')
                            square[9] = mark;
                    else
                    {
                            System.out.println("Invalid move ");
                            player--;
                    }
                    i=checkwin();
                    player++;
            } while(i==-1);
            board();
            if(i==1)
                    System.out.printf("==>Player %d win\n",--player);
            else
                    System.out.println("==>Game draw");
    }
    /*********************************************
            FUNCTION TO RETURN GAME STATUS
            1 FOR GAME IS OVER WITH RESULT
            -1 FOR GAME IS IN PROGRESS
            O GAME IS OVER AND NO RESULT
    **********************************************/

    static int checkwin() {
            if (square[1] == square[2] && square[2] == square[3])
                    return 1;
            else if (square[4] == square[5] && square[5] == square[6])
                    return 1;
            else if (square[7] == square[8] && square[8] == square[9])
                    return 1;
            else if (square[1] == square[4] && square[4] == square[7])
                    return 1;
            else if (square[2] == square[5] && square[5] == square[8])
                    return 1;
            else if (square[3] == square[6] && square[6] == square[9])
                    return 1;
            else if (square[1] == square[5] && square[5] == square[9])
                    return 1;
            else if (square[3] == square[5] && square[5] == square[7])
                    return 1;
            else if (square[1] != '1' && square[2] != '2' && square[3] != '3' && square[4] != '4' && square[5] != '5' && square[6] != '6' && square[7] != '7' && square[8] != '8' && square[9] != '9')
                    return 0;
            else
                    return -1;
    }


    /*******************************************************************
         FUNCTION TO DRAW BOARD OF TIC TAC TOE WITH PLAYERS MARK
    ********************************************************************/


    static void board() {
            //system("cls");
            System.out.println("\n\n\tTic Tac Toe\n\n");
            System.out.println("Player 1 (X)  -  Player 2 (O)\n");
            System.out.println();
            System.out.println("     |     |     ");
            System.out.println("  "+square[1]+"  |  " +square[2] + "  |  " + square[3]);
            System.out.println("     |     |     ");
            System.out.println("  "+square[4]+"  |  " +square[5] + "  |  " + square[6]);
            System.out.println("     |     |     ");
            System.out.println("  "+square[7]+"  |  " +square[8] + "  |  " + square[9]);
            System.out.println("     |     |     \n");
    }

    /*******************************************************************
                                    END OF PROJECT
    ********************************************************************/
}