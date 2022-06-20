public class RBS_duplicate {

    public static void main(String[] args) {

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
            // if element at start, middle, end are equal then skip the duplicates

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // Note: what if the element at start and end were pivot??
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // check wheather end is pivot or not

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted so pivot is at right side
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start=mid+1;
            } else{
                end=mid-1;
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
