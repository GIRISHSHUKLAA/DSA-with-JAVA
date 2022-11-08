import java.util.HashSet;

public class hashmap {
    public static void main(String[] args) {
        int[] a = {15, 20, 5, 15};
        int[] b = {15, 15, 15, 20, 10};
        System.out.println(union(a, b, a.length, b.length));
//        System.out.println(union2(a, b, a.length, b.length));


    }

    static int union(int[] a, int[] b, int m, int n) {
//        Naive Solution
//        Time Complexity:- O((m+n)*(m+n))
//        Auxiliary Space:- O(m+n)
        int[] c = new int[m + n]; // it will contain all the element of array a and b
        if (m >= 0) System.arraycopy(a, 0, c, 0, m); // copying elements of a to c
        if (n >= 0) System.arraycopy(b, 0, c, m, n); // copying elements of b to c
        int ans = 0;
        for (int i = 0; i < m + n; i++) {
//            counting distinct element inn array c
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                ans++;
        }
        return ans;
    }


    static int union2(int[] a, int[] b, int m, int n) {
//        Optimized Solution-->
//        Time Complexity:- O(m+n)
//        Auxiliary Space:- O(m+n)

        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < m; i++) {
//            We are adding all the elements of our array in a hashset
            h.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
//            We are adding all the elements of our array in a hashset
            h.add(b[i]);
        }
        return h.size();
    }
}

