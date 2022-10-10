public class ComputingPower {
    public static void main(String[] args) {
        System.out.println(power1(3, 4));
        System.out.println(power2(3, 4));
        System.out.println(power3(3, 4));
        System.out.println(power4(3, 4));



    }

    static int power1(int x, int n) {
//        Time Complexity:- O(N)
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * x;
        }
        return ans;
    }


    /*
     *                     Efficient Solution:-function--> power2()
     *                          [Recursive Approach]
     * power(x,n) |       if n is even                      |
     *            |             power(x,n/2) * power(x,n/2) |
     *            |        else                             |
     *            |            power (x,n-1) * x            |
     *            |                                         |
     *
     * Time Complexity:-O(log(N))
     * Auxiliary Space :-O(log(N))
     */
    static int power2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = power2(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }




    /*
     *                  ITERATIVE APPROACH
     * Time Complexity:-O(log(N))
     * Auxiliary Space :-O(1)
     *
     * Every number can be written as sum of power of 2 (Set bit in binary representation)
     *
     * We can traverse through all bits of a number (from LSB to MSB) in O(logN) times
     * It relates with Binary Representation of a number
     *
     *                             while(n>0){
                                        if (n % 2 != 0) {
                                  //        bit is 1
                                           } else {
                                        //        bit is 0
                                                 n = n / 2;
                                                 x=x*x
                                               }
                                           }
     *
     * We calculating x^n:- We traverse through all bits of a number n and for every bit that u
     *  traverse u consider it as a multiplier of corresponding power of x
     */

    static int power3(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if (n % 2 != 0) { // checking for current bit if its 1 then multiply
                ans = ans * x;
            }
            n = n / 2;
            x = x * x;
        }
        return ans;
    }


    
//    This is faster than above because we are using bitwise operator
    static int power4(int x, int y)
    {
        int ans = 1;

        while (y > 0)
        {
            // If y is odd,
            // multiply
            // x with result
            if ((y & 1) == 1)
                ans = ans * x;

            // y must be even now
            y = y >> 1; // y = y/2
            x = x * x; // Change x to x^2
        }
        return ans;
    }
}
