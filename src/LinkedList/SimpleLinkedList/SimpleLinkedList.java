package LinkedList.SimpleLinkedList;


public class SimpleLinkedList {
    private Node head;
    private int size;

    public void addValueAtIndex(int value, int index) {
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

    public void add(int value) {
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

    public void print() {
        Node pointer = head;
        while (pointer.next != null) {
            System.out.print(pointer.value + " --> ");
            pointer = pointer.next;
        }
        System.out.print(pointer.value + " --> null\n");
    }

    public boolean search(int value) {
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

    public int getValueByIndex(int index) {
        if (isEmpty() || index < 0) {
            return -1;
        } else {
            if (index == 0) {
                return head.value;
            } else {
                Node pointer = head;
                int i = 0;
                while (i != index && pointer.next != null) {
                    pointer = pointer.next;
                    i++;
                }
                if (i == index) {
                    return pointer.value;
                } else {
                    return -1;
                }

            }
        }
    }

    public int getIndexByValue(int value) {
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

    public void remove(int value) {
        if (!isEmpty()) {
            if(head.value == value) {
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
}


