public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 8 };
        int ans = majorityElement(nums);
        System.err.println(isMajority(nums, ans));
    }

    public static int majorityElement(int[] nums) {
        int ans = nums[0];
        int c = 0;
        for (int num : nums) {
            if (num == ans)
                c++;
            else
                c--;
            if (c == 0) {
                ans = num;
                c = 1;
            }
        }
        return ans;
    }
    /*
     * FUNCTION TO CHECK WHEATHER OF THE NUMBER OCCUR MORE THAN N/2 TIMES
     */

    static boolean isMajority(int[] nums, int ans) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ans)
                c++;
            if (c > nums.length / 2)
                return true;
        }
        return false;
    }
}
