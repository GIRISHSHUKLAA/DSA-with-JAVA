import java.util.*;
import java.lang.*;

class Node {
    char data;
    Node next;

    Node(char x) {
        data = x;
        next = null;
    }
}

public class Palindrome {

    public static void main(String[] args) {
        Node head = new Node('j');
        head.next = new Node('f');
        head.next.next = new Node('g');
        if (isPalindrome(head))
            System.out.print("Yes");
        else
            System.out.print("No");
        System.out.println();
        if (isPalindrome2(head))
            System.out.print("Yes");
        else
            System.out.print("No");


    }

    public static boolean isPalindrome(Node head) {
        Deque<Character> stack = new ArrayDeque<>();
        for (Node curr = head; curr != null; curr = curr.next)
            stack.push(curr.data);
        for (Node curr = head; curr != null; curr = curr.next) {
            if (stack.pop() != curr.data)
                return false;
        }
        return true;
    }


//    Efficient approach

    public static Node reverseList(Node head) {
        if (head == null || head.next == null) return head;
        Node rest_head = reverseList(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }


    public static boolean isPalindrome2(Node head) {
        if (head == null) return true;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverseList(slow.next);
        Node curr = head;
        while (rev != null) {
            if (rev.data != curr.data)
                return false;
            rev = rev.next;
            curr = curr.next;
        }
        return true;
    }
}
