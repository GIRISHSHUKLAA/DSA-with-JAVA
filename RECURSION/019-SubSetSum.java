
public class SubsetSum {
    public static void main(String[] args) {
        int arr[]={10,20,15};
        int n=3;
        System.out.println(subSet(arr,n,0));

    }

    static int subSet(int[] arr, int n, int sum) {
//        Time Complexity:- O(2^n)
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return subSet(arr, n - 1, sum) + subSet(arr, n - 1, sum - arr[n - 1]);
    }
}
