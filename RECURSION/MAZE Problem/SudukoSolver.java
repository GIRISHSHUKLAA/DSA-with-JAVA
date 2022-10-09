public class SudukoSolver {
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
            diplay(board);
        } else {
            System.out.println("Cannot solve");
        }
    }


    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
//        this is how we are replacing the r,c from the argument
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
//            if you found some empty element in row then break
            if (emptyLeft == false) {
                break;
            }

        }
        if (emptyLeft == true) {
            return true;
//            sudoku is solve
        }
//        backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
//                        found answer
                    return true;
                } else {
//                        backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static void diplay(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {

//        check the row
        for (int i = 0; i < board.length; i++) {
//            check if the number we are trying to solve is already in the row or not
            if (board[row][col] == num) {
                return false;
            }
        }

//        check the column
        for (int nums[] : board) {
//            check if the number we are trying to solve is already in the column or not
            if (nums[col] == num) { // same column different row
                return false;
            }
        }

//        square matrix
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);
        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }

            }
        }
        return true;
    }
}
