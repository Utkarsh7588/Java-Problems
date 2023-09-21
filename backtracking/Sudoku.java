package backtracking;

public class Sudoku {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }
    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static boolean solve(int [][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
            if(emptyLeft==false){
                break;
            }
        }
        if(emptyLeft==true){
            return true;
        }
        for(int num=1;num<=9;num++){
            if(isSafe(board,row,col,num)){
                board[row][col]=num;
                if(solve(board)){
                    return true;
                }
                else{
                    board[row][col]=0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][]board,int row,int col, int n){
        for (int i = 0; i < board.length; i++) {
            if(board[row][i]==n){
                return false;
            }
        }
        for (int i = 0; i < board.length ; i++) {
            if(board[i][col]==n){
                return false;
            }
        }
        int squareSize=(int)Math.sqrt(board.length);
        int squareRow=row-row%squareSize;
        int squareCol=col-col%squareSize;
        for (int i = squareRow; i <squareRow+3 ; i++) {
            for (int j = squareCol; j < squareCol+3; j++) {
                if (board[i][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }
}
