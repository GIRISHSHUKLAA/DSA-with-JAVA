
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 3, 56, 43, 56, 34 },
                { 5, 75, 3, 22, 98 },
                { 12, 75, 23, 67, 89 },
                { 5, 0, -43, -53 }
        };
        int target = -53;
        int[] ans = search(arr, target); 
        /* we are storing the return value in array []ans because we have to know both rows
         * and column --> {row,column}
         */
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] { row, col};
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
