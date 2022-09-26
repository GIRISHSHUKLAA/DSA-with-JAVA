import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 23, 1, -9};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
//        copy of range basically copies the specified array into a new array.
//        new array is being created and is being passed in the recursion call
//        hence the original array is not being sorted
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {
        int ans[] = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }
//        it may be possible that one of the arrays may not be completed
//        copy the remaining element
        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
