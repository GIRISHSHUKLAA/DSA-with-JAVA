import java.util.HashSet;

public class hashmap {
    public static void main(String[] args) {
        int[] a = {11, 5, 6};

        System.out.println(pairSum2(a, a.length, 10));
//        System.out.println(union2(a, b, a.length, b.length));


    }

    static boolean pairSum(int[] a, int n, int sum) {
//        Naive Solution
//        Time Complexity:- O(n^2)
//        Auxiliary Space:- O(1)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == sum)
                    return true;
            }
        }
        return false;
    }


    static boolean pairSum2(int[] a, int n, int sum) {
//        You can use two pointer approach when your array is sorted
//        Optimized Solution-->
//        Time Complexity:- O(m+n)
//        Auxiliary Space:- O(m+n)

        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (h.contains(sum - a[i])) {
                return true;
            }
            h.add(a[i]);
        }
        return false;
    }
}

