package LinkedList.SimpleLinkedList;

public class CallByRefrence {
    public static void main(String[] args) {

        int[] x = {10};
        increament(x);
        System.out.println(x[0]);
    }

    public static void increament(int [] array) {
        array[0]++;
    }
}
