
/*
 * Time Complexity--->
 *                Worst Case-- O(N*N) n square
 *                Best Case-- O(N*N) n square
 *  Space Complexity---> O(1)
 */
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, -9, 0, 76 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }

    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
