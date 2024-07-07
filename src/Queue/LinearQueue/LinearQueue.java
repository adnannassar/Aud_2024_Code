package Queue.LinearQueue;

public class LinearQueue<T> {
    private int first;
    private int last;
    private T[] queue;

    public LinearQueue(int size) {
        first = -1;
        last = -1;
        queue =  (T[]) new Object[size];
    }

    public boolean isEmpty() {
        return last == -1 && first == -1;
    }

    public boolean isFull() {
        return last == queue.length - 1;
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            queue[++last] = item;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            return queue[++first];
        }
    }
}
