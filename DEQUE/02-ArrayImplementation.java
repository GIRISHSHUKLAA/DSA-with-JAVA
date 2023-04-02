class Deque {
    int size, cap, front;
    int[] arr;

    Deque(int c) {
        cap = c;
        size = 0;
        arr = new int[cap];
        front = 0;
    }

    boolean isFull() {
        return size == cap;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void deleteFront() {
        if (isEmpty())
            return;
        front = (front + 1) % cap;
        size--;
    }

    void insertRear(int x) {
        if (isFull()) return;

        int new_rear = (front + size) % cap;
        arr[new_rear] = x;
        size++;
    }

    int getFront() {
        if (isEmpty()) return -1;

        return arr[front];
    }

    void insertFront(int x) {
        if (isFull()) return;

        front = (front + cap - 1) % cap;
        arr[front] = x;
        size++;
    }

    void deleteRear() {
        if (isEmpty()) return;

        size--;
    }

    int getRear() {
        if (isEmpty()) return -1;

        return arr[(front + size - 1) % cap];
    }
}

public class DequeImplementation {
    public static void main(String[] args) {
        Deque de = new Deque(4);
        System.out.println("Capacity: " + de.cap + ", " + "Size: " + de.size + ", " + "Front: " + de.front);
        de.insertFront(10);
        System.out.println("Size: " + de.size + ", " + "Front: " + de.front);
        de.insertRear(20);
        System.out.println("Size: " + de.size + ", " + "Front: " + de.front);
        de.insertRear(30);
        System.out.println("Size: " + de.size + ", " + "Front: " + de.front);
        de.deleteFront();
        System.out.println("Size: " + de.size + ", " + "Front: " + de.front);
        de.deleteRear();
        System.out.println("Size: " + de.size + ", " + "Front: " + de.front);
        

    }
}
