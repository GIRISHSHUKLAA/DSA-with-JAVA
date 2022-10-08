// the below implementation of N-Queens is valid only for even boards
public class NQueens {
    public static void main(String[] args) {
        int n = 5;
        boolean boards[][] = new boolean[n][n];
        System.out.println(queens(boards,0));
    }

    static int queens(boolean[][] boards, int row) {  // we can pass column also in argument but since we are starting
        // the column with zero everytime does not make sense to pass it
//         in boolean [][] boards true means queen is placed
        if (row == boards.length) { // means all the queens have been placed
//            so display the boards
            display(boards);
            System.out.println();
            return 1;
        }
        int count = 0;

//        we are now placing the queens and checking for every row and column
        for (int col = 0; col < boards.length; col++) {
//            place the queen if it is safe
            if (isSafe(boards, row, col)) {
                boards[row][col] = true;
                count += queens(boards, row + 1);
                boards[row][col] = false; // after coming out of the function call change it to normal

            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] boards, int row, int col) {
//        checking vertical row
        for (int i = 0; i < row; i++) {
            if (boards[i][col]) {
                return false;
            }
        }
//        checking diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (boards[row - i][col - i]) {
                return false;
            }
        }

//        checking diagonal right
        int maxRight = Math.min(row, boards.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (boards[row - i][col + i]) {
                return false;
            }
        }
        return true;

    }


    private static void display(boolean[][] boards) {
        for (boolean[] row : boards) {
            for (boolean element : row) {
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
