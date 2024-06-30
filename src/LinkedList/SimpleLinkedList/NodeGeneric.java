package LinkedList.SimpleLinkedList;

public class NodeGeneric<T extends Comparable<T>> {
    T value;
    NodeGeneric next;

    public NodeGeneric(T value, NodeGeneric next) {
        this.value = value;
        this.next = next;
    }
}