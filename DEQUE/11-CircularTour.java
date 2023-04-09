public class CircularTour {
    public static void main(String[] args) {
        int[] perol = {4, 8, 7, 4};
        int[] dist = {6, 5, 3, 5};
        System.out.println(firstPetrolPump(perol, dist, 4));
        System.out.println(firstPetrolPump2(perol, dist, 4));

    }

    static int firstPetrolPump(int[] petrol, int[] dist, int n) {
//        Naive Solution
//        Time Complexity:- O(n^2)
//        Auxiliary Space:- O(1)
        for (int start = 0; start < n; start++) {
            int curr_petrol = 0;
            int end = start;
            while (true) {
                curr_petrol += (petrol[end] - dist[end]);
                if (curr_petrol < 0) break;
                end = (end + 1) % n;
                if (end == start)
                    return (start + 1);
            }
        }
        return -1;
    }

    static int firstPetrolPump2(int[] petrol, int[] dist, int n) {
//        Efficient Solution
//        Time Complexity:- O(n)
        int start = 0;
        int curr_petrol = 0, prev_petrol = 0;
        for (int i = 0; i < n; i++) {
            curr_petrol += (petrol[i] - dist[i]);
            if (curr_petrol < 0) {
                start = i + 1;
                prev_petrol += curr_petrol;
                curr_petrol = 0;
            }
        }
        return ((curr_petrol + prev_petrol) >= 0) ? (start + 1) : -1;
    }
}
