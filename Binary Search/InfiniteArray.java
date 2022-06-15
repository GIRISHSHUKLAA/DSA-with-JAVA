public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
            int target=10;
            System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find range
        // first start with a size of box 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previousend + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start=newStart;
        }
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
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
