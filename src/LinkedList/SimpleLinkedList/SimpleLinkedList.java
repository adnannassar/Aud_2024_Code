package LinkedList.SimpleLinkedList;

public class SimpleLinkedList {
    private Node head = null;


    public void add(int value) {
        Node newNode = new Node(value, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void print() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.print(temp.value);
    }
}
