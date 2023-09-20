package backtracking;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(placeQueen(board, 0));
    }
    public static int placeQueen(boolean [][] board,int row){
        if(row== board.length){
            display(board);
            System.out.println();
            return 1;
        }
        for(int col=0;col<board[0].length;col++){
            if (isSafe(board, row,col)) {
                board[row][col]=true;
                placeQueen(board,row+1);
                board[row][col]=false;
            }

        }
        return -1;

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        for(int i=0;i<row;i++){
            if(board[i][col]==true){
                return false;
            }
        }
        int maxLeft=Math.min(row,col);
        for (int k = 1; k <=maxLeft; k++) {
            if(board[row-k][col-k]){
                return false;
            }
        }
        int maxRight=Math.min(row, board[0].length-col-1);
        for (int i = 0; i <=maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
}
}
