public class RotatedBinarySearch {
    public static void main(String[] args) {
        // int[] arr = { 1 };
        // int target = 0;
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        // if you do not find pivot, it mean array is not roated
        if (pivot == -1) {
            // just do normal binary search
            return binarysearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found you have found two asc sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        } else if (target >= arr[0]) {
            return binarysearch(arr, target, 0, pivot - 1);
        }
        return binarysearch(arr, target, pivot + 1, arr.length - 1);

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            // find middle element
            // int mid =(start+end)/2; //might be possible that start + end may go out of
            // int range for very large value

            int mid = start + ((end - start) / 2);
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else
                // ans found
                return mid;
        }

        return -1;
    }
}
