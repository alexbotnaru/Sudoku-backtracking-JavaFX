package sample;

public class BackTracking {

     static long nrOp = 0;
     public int[][] generateGrid(int[][] board, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }

        int max = 9, min = 1;
        int range = max - min + 1;
        board[0][0] = (int) (Math.random() * range);
        board[2][4] = (int) (Math.random() * range);
        board[3][3] = (int) (Math.random() * range);
        board[1][7] = (int) (Math.random() * range);

        solveSudoku(board, n);

        int numberOfZeros = 0, i, j;

        while (numberOfZeros < 70) {
            i = (int) (Math.random() * range);
            j = (int) (Math.random() * range);
            board[i][j] = 0;
            numberOfZeros++;
        }
        return board;
    }
         public boolean solveSudoku ( int[][] board, int n){

            int row = -1;
            int col = -1;
            boolean isEmpty = true;

            nrOp+=6;

            for (int i = 0; i < n; i++) {
                nrOp+=4;
                for (int j = 0; j < n; j++) {
                    nrOp+=4;
                    if (board[i][j] == 0) {
                        row = i;
                        col = j;

                        isEmpty = false;
                        nrOp+=4;
                        break;
                    }
                }
                if (!isEmpty) {
                    nrOp++;
                    break;
                }
            }

            if (isEmpty) {
                nrOp++;
                return true;
            }

            for (int num = 1; num <= n; num++) {
                nrOp+=4;
                if (isSafe(board, row, col, num)) {
                    board[row][col] = num;
                    nrOp+=2;
                    if (solveSudoku(board, n)) {
                        nrOp+=2;
                        return true;
                    } else {
                        nrOp++;
                        board[row][col] = 0;
                    }
                }
            }
            nrOp++;
            return false;
        }

    public static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int d = 0; d < board.length; d++) {
            nrOp+=4;
            if (board[row][d] == num) {
                nrOp+=2;
                return false;
            }
        }

        for (int r = 0; r < board.length; r++) {
            nrOp+=4;
            if (board[r][col] == num) {
                nrOp+=2;
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        nrOp+=10;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
            nrOp+=5;
            for (int d = boxColStart; d < boxColStart + sqrt; d++) {
                nrOp+=5;
                if (board[r][d] == num) {
                    nrOp+=2;
                    return false;
                }
            }
        }
        nrOp++;
        return true;
    }



    public void print(int[][] board, int N) {

        for (int r = 0; r < N; r++) {
            for (int d = 0; d < N; d++) {
                System.out.print(board[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");

            if ((r + 1) % (int) Math.sqrt(N) == 0) {
                System.out.print("");
            }
        }
    }
}
