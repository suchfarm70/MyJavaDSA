package BACKTRACKING;
public class NQueensSolutionYesNo {

    static boolean isSafe(String board[][] , int irow , int jcol){
        //we only need to check the upper half from a given point because we are placing the queens rowise
        //vertically up
        for(int i = irow - 1 ; i>= 0 ; i--){
            if(board[i][jcol] == " Q "){
                return false;
            }
        }

        //diagonally left up
        for(int i = irow - 1 , j = jcol - 1 ; i>= 0 && j >= 0 ; i-- , j--){
            if(board[i][j] == " Q "){
                return false;
            }
        }

        //diagonally right up
        for(int i = irow - 1 , j = jcol + 1; i>= 0 && j < board.length ; i-- , j++){
            if(board[i][j] == " Q "){
                return false;
            }
        }
        return true;
    }

    static int count = 0;
    static boolean QueensPlacements(String board[][] , int row){

        //base
        if(row == board.length){
            // count++;
            // printBoard(board);
            return true;
        }

        //this loop traverses the board Columnwise
        for (int j = 0; j < board.length; j++) {
            //now we are checking is it safe to place a queen overhere
            if(isSafe(board, row, j)){
                board[row][j] = " Q ";

                if(QueensPlacements(board, row + 1)){
                    return true;
                }
                //QueensPlacements(board, row + 1);//function call
                board[row][j] = " . ";//backtracking step
            }
        }
        return false;
    }
    static void printBoard(String board[][]){
        System.out.println("---------BOARD---------");
        for(int i = 0 ; i < board.length ; i++){

            for(int x = 0 ; x < 3 ; x++){
                System.out.print(" ");
            }
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int n = 2;
        String board[][] = new String[n][n];

        //initializing the Board
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board.length ; j++){
                board[i][j] = " . ";
            }
        }
        if (QueensPlacements(board, 0)) {
            System.out.println("Solution is Possible");
            printBoard(board);
        } else {
            System.out.println("Solution Not Possible");
        }
        //System.out.println("Total nummber of possible solutions are "+ count + " for "+ n +" rows");
        //printBoard(board);
    }
}