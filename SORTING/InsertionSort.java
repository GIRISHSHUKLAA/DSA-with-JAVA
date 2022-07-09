
/*
 * Time Complexity--->
 *                Worst Case-- O(N*N) n square
 *                Best Case-- O(N) 
 *  Space Complexity---> O(1)
 */
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-23,18};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        /*
         * we will run outer loop for length-1 because for the last index of i,,,, j will run for i+1 which will leads
         * to index out of bond..  
         */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } 
                /* if swap not done it means that element at j is not smaller than element at j-1 it means that
                * previous L.H.S side is already sorted
                */
                else{
                    break;
                }
            }

        }

    }

}
