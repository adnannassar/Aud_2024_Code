package Queue.LinearQueue;

public class Main {
    public static void main(String[] args) {
        LinearQueue<Integer> queue = new LinearQueue<>(5);

        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(queue.dequeue());
        }

        queue.enqueue(6);

    }
}
