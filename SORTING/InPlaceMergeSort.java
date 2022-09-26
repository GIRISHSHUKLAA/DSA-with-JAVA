import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);
        mergeInPlace(arr, s, mid, e);

    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] ans = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
//        it may be possible that one of the arrays may not be completed
//        copy the remaining element
        while (i < m) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            ans[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < ans.length; l++) {
            arr[s + l] = ans[l];
        }
    }
}
