import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        int[] arr = {15, 12, 13, 12, 13, 13, 18};
//        int[] arr = {10, 20, 20, 30, 10};

        printFreq(arr, arr.length);
        System.out.println();
        printFreq2(arr);

    }

    static void printFreq(int[] arr, int n) {
//        Naive Solution
//        Time Complexity:- O(n^2)
//        Auxiliary Space:- O(1)

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
//                Checking if element is seen before or not
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
//                if seen then ignore
                continue;
            }
//            if not seen before seen count frequency
            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            System.out.println(arr[i] + " " + freq);
        }
    }


    static void printFreq2(int[] arr) {
//        Optimized Solution-->
//        Time Complexity:- O(n)
//        Auxiliary Space:- O(n)

        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i : arr) {
            m.put(i, m.getOrDefault(i, 0) + 1);
//            m.getOrDefault() this function used to get previous frequency of i if the element is previously not
//            present then take its frequency as zero
        }

        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}

