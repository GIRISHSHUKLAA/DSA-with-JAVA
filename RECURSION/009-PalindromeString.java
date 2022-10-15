/*
 * In decimal to binary we keep the number dividing by two and keep storing the remainder
 */
public class PalindromeString {
    public static void main(String[] args) {
        String s = "aba";
        int l = s.length() - 1;
        System.out.println(isPalindrome(s, 0, l));
    }

    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (s.charAt(start) == s.charAt(end) && isPalindrome(s, start + 1, end - 1));
    }

}

// Time Complexity:- O(n)
// Auxiliary Space:- O(n)
