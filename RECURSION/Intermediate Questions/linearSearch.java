public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 38, 4, 5, 6};
        System.out.println(search(arr, 38, 0));
        System.out.println(index(arr, 38, 0));

    }

    private static boolean search(int[] arr, int target, int index) {
        if (index == arr.length)
            return false;
        return arr[index] == target || search(arr, target, index + 1);
    }

    // if you want to return index value
    private static int index(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == target)
            return index;

        else
            return index(arr, target, index + 1);
    }
}

