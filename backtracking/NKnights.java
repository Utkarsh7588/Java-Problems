package backtracking;

public class NKnights {
    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0));
    }

    public static int knights(boolean[][] board, int row){

        if(row==board.length){
            display(board);
            System.out.println();
            count++;
            return 1;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col]=true;
                knights(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        if(row-2>=0&&col-1>=0){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(row-1>=0&&col-2>=0){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(row-2>=0&&col+1<board[0].length){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(row-1>=0&&col+2<board[0].length){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
        //check on upper left and right
//        int maxLeft=Math.min(row-1,col-1);
//        while()
//        int maxRight=Math.min(row-1,board.length-1-col);
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean square:row){
                if(square){
                    System.out.print("K");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
