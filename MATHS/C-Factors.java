import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors1(20);
        factors2(20);

        System.out.println();
        factors3(20);

    }

    static void factors1(int n) {
//        Bruteforce approach---> Time Complexity: O(n)
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    static void factors2(int n) {
//        Time Complexity: O(sqrt(n))
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else
                    System.out.print(i + " " + n / i + " ");
            }
        }
//        Output: 1 2 4 5 10 20 (but this is not in sorted order)
//        to achieve this we will create array list look in function factors3()
    }

    static void factors3(int n) {
//        Time Complexity and space complexity both will be O(sqrt(n)) because we are going to use array list
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }

}
