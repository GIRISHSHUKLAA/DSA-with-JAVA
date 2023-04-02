class Deque {
    int size, cap;
    int[] arr;

    Deque(int c) {
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

    void insertRear(int x) {
        if (isFull()) return;

        arr[size] = x;
        size++;
    }

    void deleteRear() {
        if (isEmpty()) return;

        size--;
    }

    int getRear() {
        if (isEmpty()) return -1;

        return arr[size - 1];
    }

    void insertFront(int x) {
        if (isFull()) return;

        for (int i = size - 1; i > -0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = x;
    }

    void deleteFront() {
        if (isEmpty())
            return;
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    int getFront() {
        if (isEmpty()) return -1;

        return arr[0];
    }
}

public class DequeImplementation {
    public static void main(String[] args) {
        Deque de = new Deque(5);
        de.insertRear(10);
        de.insertFront(20);
        de.insertRear(30);
        de.insertFront(40);
        System.out.println();
        de.deleteFront();
//        de.deleteFront();
        System.out.println(de.getFront());
    }
}
