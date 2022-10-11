public class CountSetBit {
    public static void main(String[] args) {
        countSetBit1(5);
        countSetBit2(5);

        initialize();
        System.out.println(countSetBit3(5));
    }

    static void countSetBit1(int n) {
//       Time complexity:O(Total Bits in n)
        /*
         * check last bit if it is 1 increment the ans and remove the last bit
         *
         */
        int ans = 0;
        while (n != 0) {
            if (n % 2 != 0) { //checking whether lasts bit is set or not or (n&1)==1 ans++
                ans++;
            }
            n = n / 2; // removing last bit or n=n>>1

//            or u can directly write ans=ans+(n&1)
        }
        System.out.println(ans);
    }

    static void countSetBit2(int n) {
//        This is Brian Kernighan's Algorithm
//        Time Complexity:- O(set bit count)  (it will reach to logN, only in its worst case)
        int ans = 0;
        while (n != 0) {
            n = n & (n - 1);
            /*
             * How n&(n-1) works??
             * When u subtract 1 from a number all the bits which are zero after the last set bit become 1 and last set
             * bit become 0 from 1
             */
            ans++;
        }
        System.out.println(ans);

        //Example:
//        n = 23 = {10111}2 .
//        1. Initially, count = 0.
//        2. Now, n will change to n&(n-1). As n-1 = 22 = {10110}2 , then n&(n-1) will be {101112 & {10110}2, which will be {10110}2 which is equal to 22. Therefore, n will change to 22 and count to 1.
//        3. As n-1 = 21 = {10101}2 , then n&(n-1) will be {10110}2 & {10101}2, which will be {10100}2 which is equal to 20. Therefore, n will change to 20 and count to 2.
//        4. As n-1 = 19 = {10011}2 , then n&(n-1) will be {10100}2 & {10011}2, which will be {10000}2 which is equal to 16. Therefore, n will change to 16 and count to 3.
//        5. As n-1 = 15 = {01111}2 , then n&(n-1) will be {10000}2 & {01111}2, which will be {00000}2 which is equal to 0. Therefore, n will change to 0 and count to 4.
//        6. As n = 0, the loop will terminate and gives the result as 4.
    }


    static int countSetBit3(int n) {
        /*
         *                    <--------Lookup table method for 32 bit number-------->
         *       Time Complexity:O(1)
         * Here we have to do some pre computation
         * Idea:- We divide our input 32-bit number into 8 bit chunks so there are 4 chunks
         * so there are 4 chunks so 8 bit means u have numbers from 0 to 255 (0 to 2^7-1)
         * You have divided in 4 chunks, and now you are going to count set a bit in individual chunks ony by one
         *
         */


        /*
          * below we are handling 32bit number
          *  table[n & 0xff]--> here we find out the value of last 8 bit
          *
          * {[n & 0xff] this mean we are doing a bit wise and of our inout number with ff, ff is hexadecimal
          * representation of 8 set bit after that u shift the number by 8
          * 0xff---> this basically makes last bit as 1 and rest 0
         */
        return table[n & 0xff] +
                table[(n >> 8) & 0xff] +
                table[(n >> 16) & 0xff] +
                table[n >> 24];
    }

    static int[] table = new int[256];
// pre computation
    // recursive function to count set bits
    public static void initialize() {

        // To initially generate the table algorithmically:
        table[0] = 0;
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }
}
