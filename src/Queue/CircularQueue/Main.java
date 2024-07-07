package Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>(5);

        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= 2; i++) {
            queue.dequeue();
        }

        queue.enqueue(6);
        queue.enqueue(7);

        for (int i = 1; i <= 2; i++) {
            queue.dequeue();
        }

        queue.enqueue(10);
        queue.enqueue(-5);

        queue.dequeue();
        queue.enqueue(0);

        queue.dequeue();
        queue.dequeue();
        System.out.println("IsFull --> " + queue.isFull());

        queue.enqueue(1);
        queue.enqueue(3);

        System.out.println("IsFull --> " + queue.isFull());

        for (int i = 1; i <= 5; i++) {
            System.out.print(queue.dequeue() + "\t");
        }

        System.out.println("\nIsFull --> " + queue.isFull());

    }
}
