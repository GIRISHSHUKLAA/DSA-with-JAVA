
/*
 * Time Complexity--->
 *                Worst Case-- O(N) 
 *  Space Complexity---> O(1)
 */
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,0,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            /*
             * check wheather i is at correct index or not
             * correctIndex = arr[i] - 1
             */
            int correctIndex=arr[i] -1; // the code is true for value [1,N] for [0,N] remove -1 from (correctIndex=arr[i] -1;)
            if (arr[i] == arr[correctIndex]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
    }

}
