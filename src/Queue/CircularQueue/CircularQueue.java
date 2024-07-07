package Queue.CircularQueue;

public class CircularQueue<T> {
    private int first;
    private int last;
    private T[] queue;

    public CircularQueue(int size) {
        first = -1;
        last = -1;
        queue = (T[]) new Object[size];
    }

    public boolean isEmpty() {
        return last == -1 && first == -1;
    }

    public boolean isFull() {
        return (first == -1 && last == queue.length - 1) || (first == last && last != -1);
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            last = (last + 1) % queue.length;
            queue[last] = item;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            first = (first + 1) % queue.length;
            T item = queue[first];
            // reset pointers if queue empty (sonder fall)
            if (first == last) {
                first = last = -1;
            }
            return item;

        }
    }


}
