/*Linear search code -->
Time complexity Worst case:O(N)
Time complexity Best case:O(1)
Space complexity: O(1)
*/

public class Main {
    public static void main(String[] args) {
        String name="Lucknow";
        char target='u';
        System.out.println(linearSearch(name,target));
        System.out.println(linearSearch2(name,target));

    }

    /*
     * Search in the array: return the true if item found
     * if item not found return false
     */

    static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        // run for loop
        for (int i = 0; i < str.length(); i++) {
            // check for element at every indexif it is = target
            if (str.charAt(i) == target) {
                return true;
            }
        }

        /*
         * This line wiil execute if none of the above return statements executed
         * means that the value not found
         */

        return false;
    }

    // doing same as above but using enhanced for loop

    static boolean linearSearch2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        // enhanced for loop
        for (char ch : str.toCharArray()) {
            if (ch==target) {
                return true;
            }
        } 

        /*
         * This line wiil execute if none of the above return statements executed
         * means that the value not found
         */

        return false;
    }

}
