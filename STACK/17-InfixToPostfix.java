import java.util.*;

class Conversion {
    private int top;
    private int capacity;
    private char[] array;
    private String output;
    private Map<Character, Integer> precedence;

    public Conversion(int capacity) {
        top = -1;
        this.capacity = capacity;
        array = new char[capacity];
        output = "";
        precedence = new HashMap<>();
        precedence.put('+', 1);
        precedence.put('-', 1);
        precedence.put('*', 2);
        precedence.put('/', 2);
        precedence.put('^', 3);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public char peek() {
        return array[top];
    }

    public char pop() {
        if (!isEmpty()) {
            top--;
            return array[top + 1];
        } else {
            return '$';
        }
    }

    public void push(char op) {
        top++;
        array[top] = op;
    }

    public boolean isOperand(char ch) {
        return Character.isLetter(ch);
    }

    public boolean notGreater(char i) {
        int a, b;
        if (precedence.containsKey(i) && precedence.containsKey(peek())) {
            a = precedence.get(i);
            b = precedence.get(peek());
            return (a <= b);
        } else {
            return false;
        }
    }

    public void infixToPostfix(String exp) {
        for (int i = 0; i < exp.length(); i++) {
            if (isOperand(exp.charAt(i))) {
                output += exp.charAt(i);
            } else if (exp.charAt(i) == '(') {
                push(exp.charAt(i));
            } else if (exp.charAt(i) == ')') {
                while (!isEmpty() && peek() != '(') {
                    char a = pop();
                    output += a;
                }
                if (!isEmpty() && peek() != '(') {
                    System.out.println("Invalid expression");
                    return;
                } else {
                    pop();
                }
            } else {
                while (!isEmpty() && notGreater(exp.charAt(i))) {
                    char a = pop();
                    output += a;
                }
                push(exp.charAt(i));
            }
        }
        while (!isEmpty()) {
            char a = pop();
            output += a;
        }
        System.out.println(output);
    }
}

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d- e)^(f+g*h)-i";
        Conversion obj = new Conversion(exp.length());
        obj.infixToPostfix(exp);
    }
}
