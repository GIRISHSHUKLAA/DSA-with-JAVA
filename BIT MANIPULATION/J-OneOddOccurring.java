public class NumberAppeerarOnce {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2,6,4,7};
        int n = arr.length+1;
        ans(arr,n);
    }

    static void ans(int[] arr, int n) {
        int c1=0;
        int c2=0;
        for (int i = 1; i <= n; i++) {
            c1=c1^i;
        }
        for (int i = 0; i < n-1; i++) {
            c2=c2^arr[i];
        }
        System.out.println(c1^c2);
    }
}

