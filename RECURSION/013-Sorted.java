public class sort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 38, 4, 5, 6};
        System.out.println(sorted(arr, 0));
    }

    private static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }


}
