package LinkedList.SimpleLinkedList;

public class ListIterator<T extends Comparable<T>> implements Iterator<T> {
    private NodeGeneric<T> listHead;

    public ListIterator(NodeGeneric<T> listHead) {
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
