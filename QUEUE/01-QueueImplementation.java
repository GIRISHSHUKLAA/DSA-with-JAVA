/*
Naive Method Using Array
All method take O(1) time except deque it takes O(n) time
 */

import java.util.Scanner;

class Queue {
    int size;
    int cap;
    int[] arr;

    Queue(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
    }

    boolean isFull() {
        return size == cap;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enque(int x) {
        if (isFull()) {
            return;
        }
        arr[size] = x;
        size++;
    }

    void deque() {
        if (isEmpty()) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[0];
    }

    int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[size - 1];
    }
}


public class QueueImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(5);

        for (int i = 0; i < 5; i++) {
            q.enque(sc.nextInt());
        }
        q.deque();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.deque();
        q.deque();
        q.deque();
        q.deque();
        System.out.println(q.isEmpty());
        System.out.println(q.getRear());
    }

}
