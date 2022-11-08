import java.util.HashSet;

public class hashmap {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 15, 30, 30, 5};
        int[] b = {30, 5, 30, 80};
        System.out.println(intersection(a, b, a.length, b.length));
        System.out.println(intersection2(a, b, a.length, b.length));


    }

    static int intersection(int[] a, int[] b, int m, int n) {
//        Naive Solution
//        Time Complexity:- O(m*(m+n))
        int ans = 0;
        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
//                Checking whether the element is  repeated in a same array or not
                if (a[i] == a[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
//            Checks whether the element is present is the 2nd array or not
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    ans++;
                    break;
                }
            }

        }
        return ans;

    }


    static int intersection2(int[] a, int[] b, int m, int n) {
//        Optimized Solution-->
//        Time Complexity:- O(m+n)
//        Auxiliary Space:- O(m)

        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < m; i++) {
//            We are adding all the elements of our array in a hashset
            h.add(a[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (h.contains(b[i])) {
                ans++;
                h.remove(b[i]); // because we are checking for distinct occurrences
            }
        }
        return ans;

    }
}

