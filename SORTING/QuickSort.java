import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr={5,4,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        while (start <= end) {
//            this also a reason it will not swap if the array is already sorted
            while (nums[start] < pivot) {
                start++;
            }

            while (nums[end] > pivot) {
                end--;
            }
//            we are doing this check because the above two while loop may violate the condition of first while loop
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
//        now my pivot is at correct index, please sort two halves now
        sort(nums,low,end);
        sort(nums,start,high);
    }
}
