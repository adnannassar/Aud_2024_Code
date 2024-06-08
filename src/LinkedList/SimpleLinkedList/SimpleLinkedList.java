package LinkedList.SimpleLinkedList;


public class SimpleLinkedList {
    // add DONE!
    // isEmpty DONE!
    // print DONE!
    // search value DONE!
    // get value by index DONE!
    // get index by value DONE!
    // sort

    // TODO
    // add value at index
    // TODO
    // remove value


    private Node head ;

    public void add(int value) {
        Node toBeAdded = new Node(value, null);
        if(isEmpty()){
            head = toBeAdded;
        }else{
            Node pointer = head;
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = toBeAdded;
        }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }

    public void print(){
        Node pointer = head;
        while(pointer.next != null){
            System.out.print(pointer.value + " --> ");
            pointer = pointer.next;
        }
        System.out.print(pointer.value + " --> null\n");
    }

    public boolean search(int value){
        if(isEmpty()){
            return false;
        }
        if(head.value == value){
            return true;
        }
        Node pointer = head;
        while(pointer.next != null){
            if(pointer.value == value){
                return true;
            }
            pointer = pointer.next;
        }
        return false;
    }

   public int getValueByIndex (int index){
        if(isEmpty() || index < 0){
            return -1;
        }else{
            if(index == 0){
                return head.value;
            }else{
                Node pointer = head;
                int i = 0;
                while(i != index && pointer.next != null){
                    pointer = pointer.next;
                    i++;
                }
                if(i == index){
                    return pointer.value;
                }else{
                    return -1;
                }

            }
        }
   }

   public int getIndexByValue (int value){
        if(isEmpty()){
            return -1;
        }
        if(value == head.value){
            return 0;
        }
        Node pointer = head;
        int i= 0;
        while(pointer.next != null){
            if(pointer.value == value){
                return i;
            }
            pointer = pointer.next;
            i++;
        }
        return -1;
    }

}


