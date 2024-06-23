package LinkedList.SimpleLinkedList;


public class GenericSimpleLinkedList<T> {
    private Node head;
    private int size;

    public void addValueAtIndex(T value, int index) {
        Node toBeAdded = new Node(value, null);
        size++;
        if (index < 0) {
            return;
        }
        if (isEmpty() || size == 0) {
            head = toBeAdded;
        }
        if (index == 0) {
            if (isEmpty()) {
                head = toBeAdded;
            } else {
                toBeAdded.next = head;
                head = toBeAdded;
            }
        }
        if (index >= size) {
            add(value);
        }
        if (index > 0 && !isEmpty() && size > 0 && index < size) {
            Node pointer = head;
            int i = 0;
            while (i != index && pointer.next != null) {
                pointer = pointer.next;
                i++;
            }
            toBeAdded.next = pointer.next;
            pointer.next = toBeAdded;
        }
    }

    public void add(T value) {
        Node toBeAdded = new Node(value, null);
        size++;
        if (isEmpty()) {
            head = toBeAdded;
        } else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = toBeAdded;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return this.size;
    }


    @Override
    public String toString() {
        String erg = "[";
        Iterator<T> iterator = iterator();
        while (iterator.hasNext() ) {
            erg += iterator.next() + ", ";
        }
        return erg +  "]" ;
    }

    public boolean search(T value) {
        if (isEmpty()) {
            return false;
        }
        if (head.value == value) {
            return true;
        }
        Node pointer = head;
        while (pointer.next != null) {
            if (pointer.value == value) {
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

    public T getValueByIndex(int index) {
        if (isEmpty() || index < 0) {
            return null;
        } else {
            if (index == 0) {
                return (T) head.value;
            } else {
                Node pointer = head;
                int i = 0;
                while (i != index && pointer.next != null) {
                    pointer = pointer.next;
                    i++;
                }
                if (i == index) {
                    return (T) pointer.value;
                } else {
                    return null;
                }

            }
        }
    }

    public int getIndexByValue(T value) {
        if (isEmpty()) {
            return -1;
        }
        if (value == head.value) {
            return 0;
        }
        Node pointer = head;
        int i = 0;
        while (pointer.next != null) {
            if (pointer.value == value) {
                return i;
            }
            pointer = pointer.next;
            i++;
        }
        return -1;
    }

    public void remove(T value) {
        if (!isEmpty()) {
            if (head.value == value) {
                head = head.next;
            }
            Node pointer = head;
            Node before_Pointer = head;
            while (pointer != null) {
                if (pointer.value == value) {
                    before_Pointer.next = pointer.next;
                }
                before_Pointer = pointer;
                pointer = pointer.next;
            }
        }
    }

    public Iterator<T> iterator() {
        return new ListIterator<T>(head);
    }
}


