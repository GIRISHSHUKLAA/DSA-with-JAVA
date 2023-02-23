import java.util.Stack;

public class EvalutionOfPrefix {
    public static boolean isOperand(char c) {
        return Character.isDigit(c);
    }

    public static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);

            if (isOperand(c)) {
                stack.push(c - '0');
            } else {
                int o1 = stack.pop();
                int o2 = stack.pop();

                if (c == '+') {
                    stack.push(o1 + o2);
                } else if (c == '-') {
                    stack.push(o1 - o2);
                } else if (c == '*') {
                    stack.push(o1 * o2);
                } else if (c == '/') {
                    stack.push(o1 / o2);
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String test_expression = "+9*26";
        System.out.println(evaluate(test_expression));
    }
}
