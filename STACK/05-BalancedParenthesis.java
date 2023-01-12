import java.util.*;

public class BalancedParenthesis {
    public static void main(String[] args) {
        System.out.println(isBalanced("(()))"));
    }

    static Boolean isBalanced(String str) {
//        Time Complexity:- O(N)
//        Auxiliary Space:- O(N)
        ArrayDeque<Character> stk = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
                if (stk.isEmpty())
                    return true;
                else if (!isMatchig(stk.peek(), ch))
                    return false;
                else
                    stk.pop();

            }
        }

        return stk.isEmpty();
    }

    static boolean isMatchig(char a, char b) {
        return ((a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']'));
    }
}
