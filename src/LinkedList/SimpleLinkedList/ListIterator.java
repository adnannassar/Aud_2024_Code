package LinkedList.SimpleLinkedList;

public class ListIterator<T> implements Iterator<T> {
    private Node<T> listHead;

    public ListIterator(Node<T> listHead) {
        this.listHead = listHead;
    }

    @Override
    public boolean hasNext() {
        if(listHead != null){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if(listHead != null){
            T value = listHead.value;
            listHead = listHead.next;
            return value;
        }
        return null;

    }
}
