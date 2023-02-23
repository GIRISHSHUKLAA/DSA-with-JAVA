import java.util.*;

class Evaluate {
    private int top;
    private int capacity;
    private String[] array;

    public Evaluate(int capacity) {
        top = -1;
        this.capacity = capacity;
        array = new String[capacity];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public String peek() {
        return array[top];
    }

    public String pop() {
        if (!isEmpty()) {
            top--;
            return array[top + 1];
        } else {
            return "$";
        }
    }

    public void push(String op) {
        top++;
        array[top] = op;
    }

    public int evaluatePostfix(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            if (Character.isDigit(exp.charAt(i))) {
                push(String.valueOf(exp.charAt(i)));
            } else {
                String val1 = pop();
                String val2 = pop();
                int result;
                int int_val1 = Integer.parseInt(val1);
                int int_val2 = Integer.parseInt(val2);
                switch (exp.charAt(i)) {
                    case '+':
                        result = int_val2 + int_val1;
                        break;
                    case '-':
                        result = int_val2 - int_val1;
                        break;
                    case '*':
                        result = int_val2 * int_val1;
                        break;
                    case '/':
                        result = int_val2 / int_val1;
                        break;
                    default:
                        result = 0;
                }
                push(String.valueOf(result));
            }
        }
        return Integer.parseInt(pop());
    }
}

public class Postfix {
    public static void main(String[] args) {
        String exp = "231*+9-";
        Evaluate obj = new Evaluate(exp.length());
        System.out.println("Postfix evaluation: " + obj.evaluatePostfix(exp));
    }
}
