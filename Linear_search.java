/*Linear search code -->
Time complexity Worst case:O(N)
Time complexity Best case:O(1)
Space complexity: O(1)
*/

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 4, 3, 89, 64, 34, 2, 46, 76 };
        int target = 89;
        System.out.println(linearSearch(arr, target));
        System.out.println(linearSearch2(arr, target));
        System.out.println(linearSearch3(arr, target));
    }

    /*
     * Search in the array: return the index if item found
     * if item not found return -1
     */

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every indexif it is = target
            if (arr[index] == target) {
                return index;
            }
        }

        /*
         * This line wiil execute if none of the above return statements executed
         * means that the value not found
         */

        return -1;
    }

    // Search the target and return the element

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // enhanced for loop
        for (int element : arr) {
            if (element==target) {
                return element;
            }
        } 

        /*
         * This line wiil execute if none of the above return statements executed
         * means that the value not found
         */

        return Integer.MAX_VALUE;
    }


    // Search the target and return the true or false

    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // enhanced for loop
        for (int element : arr) {
            if (element==target) {
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
